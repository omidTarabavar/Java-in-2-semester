public class ExtendedOblong extends Oblong {
    private char symbol;
    public ExtendedOblong(double lengthIn,double heightIn,char symbolIn){
        super(lengthIn, heightIn);
        symbol = symbolIn;
    }
    public void setSymbol(char symbolIn){
        symbol = symbolIn;
    }
    public String draw(){
        int l,h;
        String s= new String();
        l = (int) getLength();
        h = (int) getHeight();
        for(int i=1;i<=h;i++){
            for(int j=1;j<=l;j++){
                s += symbol;
            }
            s += '\n';
        }
        return s;
    }
}
