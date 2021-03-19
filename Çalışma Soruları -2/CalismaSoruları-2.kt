package com.serkanalc.upschool

import java.util.*

fun main(){

    /* Soru 1

    Vücut kitle indeksi hesaplayan bir algoritma yazınız

        # Vücut kitle indeksi kilo/(boy*boy) şeklinde bulunur
        # Kullanıcıdan boy(cm) ve Kilo(kg) şeklinde istesin
        # Boyu metre cinsine çevirsin
        # Ekrana vücut kitle indeksini ve durumunu yazdırsın

    Örnek çıktı: vücut kitle indeksiniz 24 Normal kilodasınız

     */

    /* Soru 2

    kullanıcının girdiği sayıya kadar olan tek sayıların toplamını bulduran bir algoritma yazınız

        # Kullanıcıdan bir sayı alsın
        # 1 den girilen sayıya  kadar(sayıyı dahil etmesin) olan tek sayıları toplasın ekrana yazdırsın
        # for veya while döngüsü kullanınız

     */

    /* Soru 2

    kullanıcının girdiği sayıya kadar olan tek sayıların toplamını bulduran bir algoritma yazınız

        # Kullanıcıdan bir sayı alsın
        # 1 den girilen sayıya  kadar(sayıyı dahil etmesin) olan tek sayıları toplasın ekrana yazdırsın
        # for veya while döngüsü kullanınız

     */
    /* Soru 3

    başlangıçta 500 birimlik bakiye bulunsun kullanıcıdan işlem seçmesini isteyen ve bu işlemlere göre çalışan bir algoritma yazınız

        # 4 işlemi olsun bunlar para ekle, para çek, bakiye öğren, çıkış yap şeklinde adlandırılsın
        # para eklem işlemi seçildiğinde kullanıcıdan değer istesin girilen değeri bakiyeye ekleyip ekranda göstersin devam etmek isteyip istemediğini sorsun
        seçilen seçeneğe göre tekrar işlem istesin veya uygulamayı kapatsın
        #para çekme işlemi seçildiğinde bakiyeden fazla olup olmadığını kontrol etsin, fazlaysa işlemi gerçekleştiremeyeceğini belirtip tekrar işlem istesin
        fazla değilse bakiyeyi ekranda gösterip devam etmek isteyip istemediğini sorsun seçilen seçeneğe göre tekrar işlem istesin veya uygulamayı kapatsın
        #bakiye öğren işlemi seçildiğinde bakiyeyi ekrana göstersin devam etmek isteyip istemediğini sorsun seçilen seçeneğe göre tekrar işlem istesin veya uygulamayı kapatsın
        #çıkış yap işlemi seçilirse uygulamayı kapatsın

     */

}

fun vki(){

    val girdi = Scanner(System.`in`)
    print("Boyunuzu cm cinsinde giriniz ")
    var boy= girdi.nextFloat()
    print("Kilonuzu kg cinsinde giriniz ")
    var kilo= girdi.nextFloat()

    boy = boy/100

    var vki= (kilo/(boy * boy)).toInt()

    print("vücut kitle indeksiniz $vki ")

    if(vki<20){
        println("Ortalamaya göre zayıfsınız")
    }
    else if(20<vki && vki<25){
        println("Ortalama kilodasınız")
    }
    else if(25<vki && vki<30){
        println("Ortalamaya göre fazla kilolusunuz")
    }
    else if(30<vki){
        println("Obezsiniz")
    }
    else{
        print("geçerli bir değer giriniz")
    }
}

fun toplam(){

    val girdi= Scanner(System.`in`)
    print("bir sayı giriniz:")
    val sayı= girdi.nextInt()
    var toplam = 0

    for(i in 2 until sayı){
        //until sayıyı dahil etmez
        if(i%2==1){
            toplam +=i
        }
    }
    print("1 den girdiğiniz sayıya kadar olan tek sayıların toplamı: $toplam")
}

fun bankaArayüz(){

    var bakiye = 500
    val girdi= Scanner(System.`in`)

    while(true){

        print("1-Para Yatırma \n2-Para Çekme \n3-Bakiye Bilgi \n0-Çıkış \nYapmak istediğiniz işlemi Seçiniz:")
        var secim=girdi.nextInt()


        if(secim==1){
            print("Eklemek istediğiniz miktarı giriniz:")
            var ekle=girdi.nextInt()
            bakiye+=ekle

            print("İşleminiz tamamlandı güncel bakiyeniz $bakiye \nyapmak istediğiniz başka bir işlem var mı ? \n1-Evet \n0-Hayır \nCevabınız: ")
            var islem=girdi.nextInt()
            if(islem==1) {
                println("*******************************")
                continue
            }
            else {
                print("İyi günler dilerim")
                break
                }
            }
        else if(secim==2){

            print("Çekmek istediğiniz miktarı giriniz:")
            var cıktı=girdi.nextInt()

            if(bakiye<cıktı){
                println("Bakiye yetersiz lütfen başka bir işlem seciniz:")
                continue
            }
            else{
                bakiye-=cıktı
                print("İşleminiz tamamlandı güncel bakiyeniz $bakiye \nyapmak istediğiniz başka bir işlem var mı ? \n1-Evet \n0-Hayır \nCevabınız: ")
                var islem=girdi.nextInt()
                if(islem==1) {
                    println("*******************************")
                    continue
                }
                else {
                    print("İyi günler dilerim")
                    break
                    }
                }
            }
        else if(secim==3){
            print("bakiyeniz : $bakiye \nyapmak istediğiniz başka bir işlem var mı ? \n1-Evet \n2-Hayır \nCevabınız: ")

            var islem=girdi.nextInt()
            if(islem==1) {
                println("*******************************")
                continue
            }
            else {
                print("İyi günler dilerim")
                break
                }
            }
        else if(secim==0){
            print("İyi günler dilerim ")
            break
                }
        else{
            println("Girdiğiniz değer geçersiz, lütfen başka bir değer giriniz ")
            continue
            }
        }
    }



