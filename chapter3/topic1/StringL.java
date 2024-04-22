package chapter3.topic1;
class StringL{
    public static void main(String[] args) {
        String m = "11";
        String h = new String("11");
        // m = m - "aasd";
        // char z = (char) (m);
        // int y = Integer.parseInt(m);
        m="nfnfjskd";
        m="marco yimyaem 🤪";
        String n = "SLTCFI";
        System.out.println(m.length());
        System.out.println(m.charAt(0));
        System.out.println(m.indexOf('a'));
        System.out.println(m.indexOf('a',5));
        System.out.println(m.indexOf("yim"));
        System.out.println(m.indexOf("🤪"));
        // System.out.println(m.indexOf("yimz")); //-1
        System.out.println(m.substring(3));
        System.out.println(m.substring(3,16));
        System.out.println(n.substring(3,6));
        n = n.toLowerCase();
        System.out.println(n);
    }
}