package DSA.Recursion;

//only 1 disk can be moved at a time
//smaller disk must be placed on top of larger disk
public class TowerOfHanoi {
    public static void towerOfHanoi(int n , char source , char helper , char destination){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1,source,destination,helper);
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        towerOfHanoi(n-1,helper,source,destination);
    }
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B', 'C');
    }
    //here n is the number of disks
}
