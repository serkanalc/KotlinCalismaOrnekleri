import java.util.*
import kotlin.random.Random

/*

 Upschool Android Eğitim programının ilk ödev soruları ve çözümleri - Basic Kotlin Uygulama Soruları
 1. Soru -> 20 Puan
 2. Soru -> 20 Puan
 3. Soru -> 20 Puan
 4. Soru -> 40 Puan

 */

fun main(){

    /*
     asalSayı()
     gectiKaldi()
     gunHesap()
     sayıTahmin()

    */
    
}

/* Ödev 1
    Döngüler kullanarak asal sayı kontrol eden bir algoritma yazınız.
        -Kullanıcıdan sayı alınsın
        -For veya while döngüsüyle Asal olup olmadığını kontrol etsin
 */
fun asalSayı(){
    var girdi=Scanner(System.`in`)
    print("Kontrol edilmesini istediğiniz sayıyı giriniz:")
    var sayi=girdi.nextInt()

    for(i in 2..sayi/2 ){ // sayi/2 kullanımı daha performanslı bir kod çalışması sağlar
        if(sayi%i==0) {
            print("sayınız asal değil")
            break
        }
        else{
            print("sayınız asal")
            break
        }
    }

}
/* Ödev 2
    When kullanarak harf notu hesaplayan bir algoritma yazınız
        -Kullanıcıdan vize ve final notlarını istesin
        -Ortalama hesaplasın
        -Ortalamaya göre geçip kaldıklarını yazsın
        -Çıktılara göre yazılacaklar:
            0-49 FF
            50-59 DD
            60-69 CC
            70-79 BB
            80-100 AA
 */
fun gectiKaldi(){
    var girdi=Scanner(System.`in`)
    print("Vize notunuzu giriniz:")
    var vize=girdi.nextInt()
    print("Final notunuzu giriniz:")
    var final=girdi.nextInt()

    var ortalama= ((vize*0.3)+(final*0.7)).toInt()
    //"toInt()" kullanmadıkça when kullanımında hata verecektir

    when(ortalama){

        in 0..49 -> println("ortalamanız $ortalama Kaldınız \"FF\" ")
        // tırnak içinde tekrar tırkan işareti kullanabilmek için \" \" şeklinde yazılır
        in 50..59 ->println("ortalamanız $ortalama Geçtiniz \"DD\" ")
        in 60..69 ->println("ortalamanız $ortalama Geçtiniz \"CC\" ")
        in 70..79 ->println("ortalamanız $ortalama Geçtiniz \"BB\" ")
        in 80..100 ->println("ortalamanız $ortalama Geçtiniz \"AA\" ")

    }

}
/* ödev 3
    Bu gün günlerden çarşamba olduğunu varsayalım kullanıcıdan sayı alıp aldığı sayı kadar gün
    geçtiğinde günlerden hangi gün olduğunu söyleyen bir algoritma yazınız.
        -Kullanıcıdan bir sayı alsın
        -When kullanarak alınan sayıya göre girilen sayı kadar gün sonra hangi güne denk geleceğini söylesin
        -7 den büyük girilen sayılar içinde hesaplamaya devam etsin(dersteki örneğin aksine)
        örnek: girdi: 2 - çıktı: 2 gün sonra günlerden Cuma
 */
fun gunHesap(){
    var girdi=Scanner(System.`in`)
    print("kaç gün sonrasını öğrenmek istersiniz:")
    var gun=girdi.nextInt()
    print("$gun gün sonra günlerden ")

    //"nextInt()" kullanımında ınt belirtilmediği sürece when işleminde sorun yaşanacaktır

    when(gun%7){
        0->print("çarşamba")
        1->print("perşembe")
        2->print("cuma")
        3->print("cumartesi")
        4->print("pazar")
        5->print("pazartesi")
        6->print("salı")
        else->print("geçerli bir değer giriniz")

    }


}
/* Ödev 4
    1 ile 100 arasında rastgele bir sayı seçilsin kullanıcıdan bu sayının bulunması istenilsin.
    Kullanıcının bilmek için 3 hakkı olsun
        -Kullanıcıya 3 tahmin hakkı verilsin
        -Program random 1 sayı seçsin
        -Kullanıcıdan tahmin için sayı istesin
        -Girilen sayı random sayıdan büyükse daha küçük, küçükse daya büyük bir sayı deneyin diye
         çıktı versin ve 1 tahmin hakkı düşürsün, kalan hakkı göstersin
        -Tahmin hakkı kaldığı sürece tekrar sayı istesin
        -Tahmin hakkı bittiğinde program hakkınız bitti yazıp kapansın
        -Doğru tahmin edildiğinde Program tebrik edip kapansın
 */

fun sayıTahmin(){

    var girdi=Scanner(System.`in`)
    var hak= 3
    var rastgeleSayı= Random.nextInt(0,101)
    //val randomSayi = (1..100).random() şeklinded de kullanılabilir

    while(true){
        if (hak==0){
            print("Deneme Hakkınız Bitti :( \nRastgele sayı -> $rastgeleSayı")
            break
        }
        else {
            print("tahmininizi giriniz:")
            var sayı = girdi.nextInt()

            if (sayı < rastgeleSayı) {
                println("daha büyük bir sayı dene")
                hak -= 1
                println("Kalan hakkınız $hak")
                continue
            }

            if(sayı>rastgeleSayı){
                println("daha küçük bir sayı dene")
                hak -= 1
                println("Kalan hakkınız $hak")
                continue
            }

            else{
                println("tebrikler doğru sayıyı buldunuz")
                break
            }
        }
    }
}
