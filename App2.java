
import it.*;
import it.hons.*;
import amc.*;

class App2 {
    public static void main(String[] ar) {
        it.Firstyear fyi = new it.Firstyear(); // from it package
        amc.Firstyear fya = new amc.Firstyear(); // explicitly using amc package
        amc.Secondyear sy = new amc.Secondyear(); // from amc package
        it.hons.Fourthyear itHons = new it.hons.Fourthyear(); // from it.hons package

        fya.display();
        fyi.display();
        sy.display();
        itHons.display();
    }
}