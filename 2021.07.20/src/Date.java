public class Date {
	private int d, m, y;
	
	public Date() {}
	
	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}
	
	
	public void display() {
		System.out.println(this.d+" "+this.m+" "+this.y);
	}

    public void increment() {
    	
        if (this.m==4|| this.m==6|| this.m==9|| this.m==11 || this.m==12)

        {

            if(this.d<31){
                this.d++;
            }

            else {
            	
            	this.d=1;
            	
                if(this.m<12) {
                	this.m++;
                }
                else {
                	this.d = this.m = 1;
                	this.y++;
                }
            }

        }

        else if(this.m==1|| this.m==3|| this.m==5|| this.m==7|| this.m==8|| this.m==10) {

            if(this.d<31){
            	this.d++;            	
            }
            else {
            	this.d=1;
            	this.m++;
            }
            
        }

        else {

            if((this.y%4) ==0 && (this.y%100!=0 || this.y%400==0)) {

                if (this.d<29) {
                	this.d++;
                }
                else{
                	this.d=1;
                	this.m++;
                }
            }

            else {

                if (this.d<28) {
                	this.d++;
                }
                else{
                	this.d=1;
                	this.m++;
                }
            }
        }
    }

   

    public static void main(String args[]) {
    	
      Date d = new Date(29, 2, 2012);  
      
      d.display();
      d.increment();
      d.display();
    }

}