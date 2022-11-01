# Konu: ## Hepsiburada.com üzerinden sepete ürün eklenmesi

# Kullanılacak Teknolojiler: ## Selenium

## 1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
1. Kullanıcı Hepsiburada.com sitesini ziyaret eder.
2. Kullanıcı giriş işlemi yapılır.
3. Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı - doğrulanır
4. Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
5. Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
6. Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
7. Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.

## 2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
1. Kullanıcı Hepsiburada.com sitesini ziyaret eder.
2. Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
3. Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
4. Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.

## Gereksinimler 
- Proje Java programlama dilinde yazılmalıdır. Maven repo kullanılmalıdır.
- Kodlar github üzerinden paylaşılması gereklidir. 
- Yazılacak senaryo için Selenium ve JUnit/Testng kullanılmalıdır. 
- Assertions kullanarak senaryonun doğru çalışırlığı kontrol edilmelidir.
- Log kullanılmalıdır.
- Page object model uygulanmalıdır.
- OOP prensiplerine uygun geliştirilmelidir.