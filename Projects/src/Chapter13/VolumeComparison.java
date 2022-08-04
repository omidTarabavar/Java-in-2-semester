package Chapter13;

public class VolumeComparison<T extends Calculatable,S extends Calculatable>{
    T first;
    S second;

    public VolumeComparison(T first,S second){
        this.first = first;
        this.second = second;
    }
    public int compareVolume(){
        if(first.calculateVolume() < second.calculateVolume()){
            return -1;
        }else if(first.calculateVolume() > second.calculateVolume()){
            return 1;
        }else {
            return 0;
        }
    }

}
