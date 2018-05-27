
from kivy.app import App 
from kivy.uix.button import Button
from kivy.uix.codeinput import CodeInput
from pygments.lexers import HtmlLexer

from kivy.config import Config
Config.set('graphics', 'resizable', '0')
Config.set('graphics', 'widht', '640')
Config.set('graphics', 'hight', '480')

from kivy.uix.floatlayout import FloatLayout


class MyApp(App):


	def build(self):

		f1 = FloatLayout(size = (300, 300))
		f1.add_widget(Button(
			text = "My first button!!!" , 
			font_size = '30',
			on_press = self.btn_press,
			background_color = [1, 0, 0, 1],
			background_normal = '',
			size_hint = (.50, .25),
			pos = (0, 0)))


		return f1

	def btn_press(self, instance):
		print('Button on click!!!')
		instance.text = 'HELLO, WORLD!!!'
		instance.background_color = [0, 1, 2, 1]


if __name__ == '__main__':
	MyApp().run()