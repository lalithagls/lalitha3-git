import java.applet.*;
import java.awt.*;
/*<applet code="ParamDemo" width=100 height=200>
  <param name="uname" value="HelloCSE"/>
  <param name="uid" value="1234"/>
  </applet> */
public class ParamDemo extends Applet
{
   String msg,msg1;
   public void init()
   {
      setBackground(Color.pink);
      setForeground(Color.black);
   }
   public void start()
   {
     msg=getParameter("uname");
     msg1=getParameter("uid");
   }
   public void paint(Graphics g)
   {
      g.drawString("Username:"+msg,100,150);
      g.drawString("UserId:"+msg1,400,150);
   }
}   