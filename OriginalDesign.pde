

void setup()
{
size(100,100);
}
void draw()
{
 	face();
 	ears();
 	square();
 	oval(); 
}
void face()
{
	fill(250,100,100);
  	ellipse(30,35,50,50);	
}
void ears()
{
	fill(100,100,100);
  	ellipse(10,15,20,20);

  	ellipse(50,15,20,20);
}
void square()
{
	fill(100,250,100);
  	rect(10,70,50,20);	
} 

void oval()
{
	fill(100,100,250);
  	ellipse(80,50,20,90);	
}