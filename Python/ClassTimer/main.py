
import sys
import time


class timer:

	def start_timer(self, m, s, d):
		self.m = m
		self.s = s
		self.d = d	
		while self.m != self.d:
			time.sleep(1)
			self.s+=1
			sys.stdout.write('\r\r' + 'timer: ' + str(self.m) + ':' + str(self.s) + ' ')
			if self.s == 60:
				self.m+=1
				self.s = 0


timer_now = timer()
timer_now.start_timer(0, 0, 2)