@HepsiBurada-UrunListeleme-SepeteEkleme
  Feature: HepsiBurada menusunden ilerleyerek sepete urun ekleme
  Scenario: Bilgisayar kategorisinden, filtreleme ile ürün sepete ekleme
    Given Kullanici anasayfadadir
    Given Cookie kabul edilir
    Given Ust menuden Elektronik - Bilgisayar Tablet - Notebook tiklar
    Given Cok satanlar siralamasini secer
    When Urunlerden ilkine tiklar
    When Urun adetini artirir
    Then Sepete ekler

    @HepsiBurada-UrunArama-Yorum
    Scenario: Urun arama alaninda bilgisayar kelimesi aratılarak ürün detay sayfasindan yorum begenme
      Given Kullanici anasayfadadir
      Given Cookie kabul edilir
      Given Urun arama alanindan bilgisayar aratilir
      Given Gelen urunlerden ilkine tiklanir
      Given Urun detaydan degerlendirmelere tiklanir
      Then Ilk yoruma faydali butonuna tiklanir
      Then Yorum olup olmadigini kontrol eder
      Examples:
        | Yorum varsa    | Tesekkur ederiz mesaji gorunur
        | Yorum yoksa    | Herhangi bir islem yapmaz



