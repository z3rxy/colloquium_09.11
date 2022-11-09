import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void main() {
        String[] str1 =  {"bla", "coll", "unit"};
        String[] str2 = {"3", "0", "5" };
        String[] str = {"blablabla", "", "unitunitunitunitunit"};
        String temp;
        for(int i = 0; i < 3; i++){
            temp = Main.result(str1[i], str2[i]);
            assertEquals(temp, str[i]);
        }
    }


}