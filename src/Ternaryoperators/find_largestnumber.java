package Ternaryoperators;

public class find_largestnumber {
    public static void main(String[] args) {
        //find the largest number between n1,n2 and n3//
        int l1=5, l2=2, l3=0;
        int largestnumber = (l1>=l2)? ((l1>l3)? l1:l3 ) :((l2>l3)? l2:l3);
        System.out.println("largestnumber is :" +largestnumber);

    }
}
// rough logic:
//l1=5, l2=2, l3=9 -->largest number is 9=l3
//l1>=l2? y:n
//y= l1>l3--yes-l1 : no -->l3
//n = l2>l3-->yes->l2 : no-->l3