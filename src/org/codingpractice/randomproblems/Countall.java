package org.codingpractice.randomproblems;

abstract class count{
    public abstract void itemType();
    public abstract int counta();
    public int Total(int a, int b){
        int total = 0;
        total = a+b;
        return total;
    }
}

 

class countA extends count {
    public void itemType(){
        System.out.println("Food");
    }
    public int counta(int c, int d){
        int total1 = 0;
        total1 = c+d;
        return total1;
    }

 

    @Override

 

    public int counta() {
        // TODO Auto-generated method stub
        return 0;
    }
}

 


public class Countall extends count{
    public static void main (String [] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        
        countA cntA = new countA();
        cntA.itemType();
        int resultA = cntA.Total(c, d);
        System.out.println(resultA);
        
        Countall cnt = new Countall();
        int result = cnt.Total(a, b);
        System.out.println(result);
       
    }

 

    @Override
    public int counta() {
        // TODO Auto-generated method stub
        return 0;
    }



	@Override
	public void itemType() {
		// TODO Auto-generated method stub
		
	}
}