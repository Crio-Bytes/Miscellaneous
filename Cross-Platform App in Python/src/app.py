from kivymd.app import MDApp
from kivy.lang import Builder
from kivy.properties import ObjectProperty
import requests

kv = """
Screen:
    in_class: text
    MDLabel:
        text: 'What is the Sentiment?'
        font_style: 'H2'
        pos_hint: {'center_x': 0.6, 'center_y': 0.8}
    MDTextField:
        id: text
        hint_text: 'Enter your sentence' 
        pos_hint: {'center_x': 0.5, 'center_y': 0.4}
        size_hint_x: None
        width: 300
        icon_right: "account-search"
        required: True
        
    MDRectangleFlatButton:
        text: 'Lets Go!'
        pos_hint: {'center_x': 0.5, 'center_y': 0.3}
        on_press:
            app.sentiment()
    
    MDLabel:
        text: ''
        id: show
        pos_hint: {'center_x': 0.9, 'center_y': 0.2}
        theme_text_color: 'Custom'
        text_color: (0, 1, 0, 1)
"""


class Main(MDApp):
    in_class = ObjectProperty(None)
        
    def build(self):
        return Builder.load_string(kv)

    def sentiment(self):
        sentence = self.root.in_class.text
        data = {'text': sentence}
        r = requests.post(url='https://sentim-api.herokuapp.com/api/v1/', 
                            headers={'Content-Type': "application/json", 'Accept': "application/json"},
                            json=data)
        label = self.root.ids.show
        label.text = r.json()['sentences'][0]['sentiment']['type']

Main().run()