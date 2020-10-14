//图书馆借书还书场景
//学生、书籍、管理员
//学生
public class Student{
    //属性
    //学号
    int no;
    //卡内余额
    int value;
    //借书数量
    int num;
    //借书的数量上限
    int max;
    //已借书的序列号
    int[] list = new int[max];
    //姓名
    String name;
    //是否逾期
    boolean Trust;
    //方法
    //借书
    public void borrowBook(int bookno){
        list[num] = bookno;
        num = num + 1;
    }
    //还书
    public void returnBook(int bookno){
        num = num - 1;
    }            
}

//书籍
public class Book{
    //书籍编号
    int bookno;
    //状态：是否被借阅,True表示被借阅
    boolean state;
    //借阅者的卡号
    int no;
    //存放位置
    String location;
    //被借阅
    public void Bebrrow(int stuno){
        state = True;
        no = stuno;
    }
    //被规还
    public void Bereturn(String loca){
        no = 0;
        state = False;
        location = loca;
    }
}


//图书管理员
public class Administrator{
    //在馆图书数量
    int num;
    //藏书上限
    int max;
    //书的序列号
    int[] booklist = new int[max];
    //管理归还的书
    public void reciveBook(int state){
        if(state){
            num = num - 1;
        }else{
            num = num - 1;
        }
    }
}





//分别从“厂家、车主、交通管理机构”3个角度，设计3个“汽车”的类
//厂家
public class Manufacture{
    //车的颜色
    int color;
    //车的型号
    int type;
    //车的报价
    int value;
    //根据型号给出报价
    public void getValue(int price){
        value = price;
    }
}
//车主
public class Manager{
    //牌照号码
    String license;
    //生产厂家
    String manu;
    //出厂日期
    int date;
    //汽车位置横坐标x
    int x;
    int y;
    //开车(从某一位置到下一位置)
    public void drive(int pos_x,int pos_y){
        x = pos_x; 
        y = pos_y;
    }
}
//管理机构
public class Adminis_car{
    //车牌号
    String license;
    //车主
    String name;
    //分数（满分12分）
    int score;
    //违规次数
    int num;
    //汽车违规
    public void violate(void){
        score = score - 1;
        num = num + 1;
    }
}