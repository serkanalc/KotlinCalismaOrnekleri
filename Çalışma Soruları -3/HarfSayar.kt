package com.serkanalc.upschool

fun main(){

    var Kelimelik = Kelimelik()

    var sonuc= Kelimelik.HarfSayar("Muvaffakiyetsizleştiricileştiriveremeyebileceklerimizdenmişsinizcesine",'e')
}

class Kelimelik(){

    fun HarfSayar(kelime:String,harf:Char){
        var sayac = 0
        for (i in kelime){
            if(i==harf)
                sayac += 1
        }
        print("\"$kelime\" kelimesinde toplam $sayac tane $harf harfi var")
        // \" kullanımı yapmazsanız " işaretini görmeyecektir
    }
}