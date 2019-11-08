
public class HashDemo {
	public static void main(String[] args) {
		Integer ints = new Integer(10);
		int s = ints.hashCode();
		//System.out.println(s);
		
		//System.out.println(Integer.hashCode(10));
		String str = "Lee";
		//System.out.println(str.hashCode());
		String ss = "1";
		//System.out.println(ss.hashCode());
		for (int i = 0; ; ++i) {
			System.out.println(i);
			if(i> 10){
				break;
			}
		}
	}
	
//	public int hashCode() {
//        int h = hash;
//        if (h == 0 && value.length > 0) {
//            char val[] = value;
//
//            for (int i = 0; i < value.length; i++) {
//                h = 31 * h + val[i];
//            }
//            hash = h;
//        }
//        return h;
//    }
}
