import tkinter as tk
class Playcomponent(object):
    def __init__(self,canvas,item):
        self.canvas=canvas
        self.item=item
    def move(self,x,y):
        self.canvas.move(self,x,y)
    def position(self):
        return self.canvas.coords(self.item)
    def delete(self):
        self.canvas.delete(self.item)


class paddle(Playcomponent):
    def __init__(self, canvas, x, y):
        self.height = 5
        self.width = 100
        self.ball = None
        item = canvas.create_rectangle(x - self.width / 2,
                                       y - self.height / 2,
                                       x + self.width / 2,
                                       y + self.height / 2,
                                       fill='red')
        super(paddle, self).__init__(canvas, item)

    def set_ball(self, ball):
        self.ball = ball
    def move(self,dist):
        coord=self.position()
        width=self.canvas.winfo_width()
        if coord[2] +dist <=width and coord[0]  +dist>=0:
            super(paddle, self).move(dist,0)
            if self.ball is not None:
                self.ball.move(dist,0)

class Game(tk.Frame):
    def __init__(self,master):
            super(Game,self).__init__(master)
            self.width = 1500;
            self.height = 800;

            self.canvas = tk.Canvas(self,bg='cornsilk',width=self.width,height=self.height)
            self.canvas.pack()
            self.pack()

            self.items={}
            self.paddle=paddle(self.canvas,self.width/2,320)
            self.items[self.paddle.item]=self.paddle

            self.hud=None
            self.init_game()
            self.canvas.focus_set()
            self.canvas.bind('<Left>',
                             lambda _:self.paddle.move(-30))
            self.canvas.bind('<Right>',
                             lambda _:self.paddle.move(+30))
    def init_game(self):
            self.start_game()

    def start_game(self):
            self.canvas.unbind('<space>')
            self.paddle.ball=None
if __name__ =='__main__':
    root = tk.Tk()
    root.title('Brick Breaker')
    game = Game(root)
    game.mainloop()
