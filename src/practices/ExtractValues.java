package practices;

import java.text.DecimalFormat;

public class ExtractValues {

    public static void main(String[] args) {

        String str = "40% off Deal $59.99 List Price: $99.99";

        int percentage = Integer.parseInt(str.substring(0,str.indexOf("%")));

        double deal = Double.parseDouble(str.substring(str.indexOf("$")+1,str.indexOf(" List")));

        double price = Double.parseDouble(str.substring(str.lastIndexOf("$")+1));

        double checking = price - (price*(percentage/100.0));

        DecimalFormat format = new DecimalFormat("##.00");

        checking = Double.parseDouble(format.format(checking));

        System.out.println(checking == deal ? "PASS" : "FAIL");

    }
}
