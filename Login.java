public class Login {
	
	public static void main(String args[]){
		
	      System.out.println(hashThis("LawAnd3021hkLAUGH"));
		//System.out.println(factorial(9));
		
	}

	
	
	public static String hashThis(String p){
		
		String[] contains = new String[30];
		contains[0]="k";
		contains[1]="b";
		contains[2]="e0k";
		contains[3]="wx";
		contains[4]="q";
		contains[5]="u";
		contains[6]="k";
		contains[7]="1";
		contains[8]="v";
		contains[9]="g";
		contains[10]="c";
		
		if(p.equals("")){
			return "No string entered";
		}
		String hash = "";
		double i=p.length();
		double v=0;
		double cn=0;
		
		double ca=0;
		double lc=0;
		double sc=0;
		
		int[] n = new int[10];
		double t=0;
 
		
		
		for(int l=0;l<p.length();l++){
		String o = p.substring(l, l+1);
		
		
		switch(o){
		
		
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			v++;
			ca++;
		break;
		
		case "B":
		case "C":
		case "D":
		case "F":
		case "G":
		case "H":
		case "J":
		case "K":
		case "L":
		case "M":
		case "N":
		case "P":
		case "Q":
		case "R":
		case "S":
		case "T":
		case "V":
		case "W":
		case "X":
		case "Y":
		case "Z":
			cn++;
			ca++;
			break;
		
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			v++;
			lc++;
			break;
			
		case "b":
		case "c":
		case "d":
		case "f":
		case "g":
		case "h":
		case "j":
		case "k":
		case "l":
		case "m":
		case "n":
		case "p":
		case "q":
		case "r":
		case "s":
		case "t":
		case "v":
		case "w":
		case "x":
		case "y":
		case "z":
			cn++;
			lc++;
			break;
		
		case "0":
			n[0]=n[0]+1;
			t++;
			break;
		case "1":
			n[1]=n[1]+1;
			t++;
			break;
		case "2":
			n[2]=n[2]+1;
			t++;
			break;
		case "3":
			n[3]=n[3]+1;
			t++;
			break;
		case "4":
			n[4]=n[4]+1;
			t++;
			break;
		case "5":
			n[5]=n[5]+1;
		    t++;
		    break;
		case "6":
			n[6]=n[6]+1;
			t++;
			break;
		case "7":
			n[7]=n[7]+1;
			t++;
			break;
		case "8":
			n[8]=n[8]+1;
			t++;
			break;
		case "9":
			n[9]=n[9]+1;
			t++;
			break;
		
		default:
			sc++;
			break;
	}
		
		
	}
		
		/*System.out.println(i + " " + v + " " + cn + " " + ca + " " + lc + " " + sc + " " + t);
		for(int x=0;x<10;x++){
			System.out.println(n[x]);*/
			
			double tlim=(Math.pow(Math.cos(cn),2))+5*(cn)+1;
			double blim=(Math.pow(Math.sin(cn), 2))+2*(cn);
			
			double B=((Math.sqrt((Math.pow(tlim,2))+tlim+1)) - ((1/2) * (Math.log1p(Math.sqrt((Math.pow(tlim,2))+tlim+1)+tlim-1/2))));
			double A=((Math.sqrt((Math.pow(blim,2))+blim+1)) - ((1/2) * (Math.log1p(Math.sqrt((Math.pow(blim,2))+blim+1)+blim-1/2))));
			
			double condA=(B-A);
			
			if(condA<5.0){
				hash = hash + "k";
			}
			if(condA>5.0 && condA<6.0){
				hash = hash + "p";
			}
			if(condA>6.0 && condA<7.0){
				hash = hash + "a";
			}
			if(condA>7.0 && condA<8.0){
				hash=hash+"f";
			}
			if(condA>8.0 && condA<12.0){
				hash=hash+"q";
			}
			if(condA>12.0){
				hash=hash+"r";
			}
			
			if(t==0){
				t=1;
				double condB = i/t;
			}
			
				double condB = i/t;
				
				hash=hash+contains[(int) condB];
				hash=hash+contains[(int) i];
				hash=hash+contains[(int) t];
				
				
				
				
			
			return hash;
			//System.out.println(condA);
			
		}
		
	public static double factorial(double x){
		
		double f=x*(x-1);
		
		for(double k=(x-2);k>0;k--){
			
			f = f * k;
			
		}
		return f;
		
		
		
		
		
	}

}