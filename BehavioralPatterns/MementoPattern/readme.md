# Memento Pattern : Durum Saklama ve Geri Yükleme

Bu proje, Java'da Memento Pattern kullanarak bir nesnenin iç durumunu saklamayı ve geri yüklemeyi göstermektedir.

## Örnek Senaryo

Bu örnekte:
- **Memento**: Nesnenin iç durumunu saklayan sınıf.
- **Originator**: İç durumunu saklayan ve geri yükleyen sınıf. Durumunu `Memento` olarak kaydeder ve geri yükler.
- **Caretaker**: `Memento` nesnelerini saklayan ve yöneten sınıf.
- **Main**: `Originator` ve `Caretaker` sınıflarını kullanarak bir nesnenin durumunu kaydeder ve geri yükler.

## UMl Diagram
![MementoPattern](MementoPattern.png)

## Kod Yapısı

Tüm sınıflar `src/` dizini altında bulunmaktadır.

### 1. `Memento` Sınıfı

Dosya: `src/Memento.java`

`Memento` sınıfı, nesnenin iç durumunu saklar ve bu durumu geri yüklemek için kullanılır.

### 2. `Originator` Sınıfı

Dosya: `src/Originator.java`

`Originator` sınıfı, iç durumunu saklar ve geri yükler. Durumunu `Memento` olarak kaydeder ve geri yükler.

### 3. `Caretaker` Sınıfı

Dosya: `src/Caretaker.java`

`Caretaker` sınıfı, `Memento` nesnelerini saklar ve yönetir. Saklanan `Memento`'ları alır ve ekler.

### 4. `Main` Sınıfı

Dosya: `src/Main.java`

`Main` sınıfı, `Originator` ve `Caretaker` sınıflarını kullanarak bir nesnenin durumunu kaydeder ve geri yükler.

### Kod Çıktısı

Program çalıştırıldığında aşağıdaki gibi bir çıktı elde edilir:

```plaintext
Current State: State #3
Restored State: State #2
```

### Açıklama

`Memento Pattern`, bir nesnenin iç durumunu saklamayı ve bu durumu geri yüklemeyi sağlar. Bu örnekte, `Originator` sınıfı durumu `Memento` olarak saklar ve `Caretaker` sınıfı bu `Memento`'ları yönetir.

## Lisans

Bu proje [MIT Lisansı](LICENSE) altında lisanslanmıştır.
