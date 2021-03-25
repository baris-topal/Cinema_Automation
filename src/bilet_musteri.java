public class bilet_musteri extends bilet{
    
    private float bilet_fiyat;
    
    public float getFiyat(){
        return this.bilet_fiyat;
    }
    
    public void setFiyat(float fiyat){
        if(fiyat <0){
            fiyat = Math.abs(fiyat);
        }
        this.bilet_fiyat = fiyat;
    }
}
