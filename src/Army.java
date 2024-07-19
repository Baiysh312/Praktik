import java.util.Arrays;

public class Army {
    Voennyi []voennyis= new Voennyi[5];

    private int count = 0;
    public void addVoenny(Voennyi voennyi){
        if(count<voennyis.length){
            voennyis[count]= voennyi;
            count++;
        }
    }

    public void info(){
        for (Voennyi voennyi:voennyis) {
            System.out.println("name: "+voennyi.name);
            System.out.println("bag: "+voennyi.getBag().color);
            System.out.println("vmestimost bag: "+voennyi.getBag().vmestimost);
            System.out.println("year: "+voennyi.year);
            System.out.println("zvanie: "+voennyi.zvanie);
            System.out.println("--------------------------------------");
        }
    }
}
