@us13
  Feature: US_13 Kullanici yeni bir banka hesabı(Account) oluşturabilir.
    Background:yeni kullanıcı olusturma
      Given Kullanici gmibank anasayfaya gider
      And Giris simgesine tiklar
      And Gecerli username ve password girer
      And Sign in butonuna tiklar
      And My Operation tiklar
      And Manage Accounts tiklar
      And +Create a new Account tiklar
      And Create or edit a Account yazisini gorur

    @CHECKING&ACTIVE
    Scenario:TC_01 kullanici  transfer için Acount Taype (CHECKING) Acount Status Tayp (ACTIVE) bilgileri girmelidir
      Given kullanici Description texbos acıklama yapmalıdır
      And kullanici Balance texbos fiyat  girmelidir
      And kullanici Account Type CHECKING girmelidir
      And kullanici Account Status Type ACTIVE girmelidir
      And kullanici Create Date girmeli
      And kullanici Closed Date girmelidir
      And kullanici Employee tıklamalıdr
      And kullanici Save butonuna tıklamalıdır
      And sayfa kapanır

    @SAVİNG&SUESPENDED
    Scenario:TC_01 kullanici  transfer için Acount Taype (SAVING) Acount Status Tayp (SUESPENDED) bilgileri girmelidir
      Given kullanici Description texbos acıklama yapmalıdır
      And kullanici Balance texbos fiyat  girmelidir
      And kullanici Account Type SAVING girmelidir
      And kullanici Account Status Type SUESPENDED girmelidir
      And kullanici Create Date girmeli
      And kullanici Closed Date girmelidir
      And kullanici Employee tıklamalıdr
      And kullanici Save butonuna tıklamalıdır
      And sayfa kapanır


    @CREDIT_CARD&CLOSED
    Scenario:TC_01 kullanici  transfer için Acount Taype (CREDIT_CARD) Acount Status Tayp (CLOSED) bilgileri girmelidir
      Given kullanici Description texbos acıklama yapmalıdır
      And kullanici Balance texbos fiyat  girmelidir
      And kullanici Account Type CREDIT_CARD girmelidir
      And kullanici Account Status Type CLOSED girmelidir
      And kullanici Create Date girmeli
      And kullanici Closed Date girmelidir
      And kullanici Employee tıklamalıdr
      And kullanici Save butonuna tıklamalıdır
      And sayfa kapanır

    @INVESTING&CLOSED
    Scenario:TC_01 kullanici  transfer için Acount Taype (INVESTING) Acount Status Tayp (CLOSED) bilgileri girmelidir
      Given kullanici Description texbos acıklama yapmalıdır
      And kullanici Balance texbos fiyat  girmelidir
      And kullanici Account Type INVESTING girmelidir
      And kullanici Account Status Type CLOSED girmelidir
      And kullanici Create Date girmeli
      And kullanici Closed Date girmelidir
      And kullanici Employee tıklamalıdr
      And kullanici Save butonuna tıklamalıdır
      And sayfa kapanır
