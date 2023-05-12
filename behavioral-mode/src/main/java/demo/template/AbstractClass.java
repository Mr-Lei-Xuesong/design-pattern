package demo.template;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 18:55
 * @Description: 抽象类
 */
public abstract class AbstractClass {

    public final void cookProcess() {
        //第一步：倒油
        this.pourOil();
        //第二步：热油
        this.heatOil();
        //第三步：倒蔬菜
        this.pourVegetable();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }

    public final void pourOil() {
        System.out.println("倒油");
    }

    //第二步：热油是一样的，所以直接实现
    public final void heatOil() {
        System.out.println("热油");
    }

    //第三步：倒蔬菜是不一样的（一个下包菜，一个是下菜心）
    public abstract void pourVegetable();

    //第四步：倒调味料是不一样
    public abstract void pourSauce();

    //第五步：翻炒是一样的，所以直接实现
    public final void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }
}
