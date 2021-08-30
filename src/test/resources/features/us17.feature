@wip
Feature: US0017_AdminRolAktivasyonu
  Background: Sistem, Adminin kullanıcıları yönetmesine izin vermelidir
    Given Kullanici gmibank anasayfaya gider
    And kullanici insan figurune tiklar
    And kullanici sign_in sekmesine tiklar
    And kullanici gecerli username girer
    And kullanici gecerli password girer
    And sign_in ile giris yapar
    And Administration bolumune tiklar
    And userManagementa tiklar
  @cip
  Scenario Outline: kullanici admin olarak rol etkinlestirirr
    Then kullanici edit sekmesine tiklar
    And  admin profilesden "<role>" secer ve save eder
    And sayfa kapanır
    Examples:
      |role|
      |ROLE_USER|
      |ROLE_EMPLOYEE|
      |ROLE_MANAGER |
      |ROLE_ADMIN   |

  @test5
  Scenario: Admin kullanici goruntuleyebilmeli
    Then kullanici view sekmesine tiklar
    And secilen kisinin goruntuleme islemini dogrular
    And sayfa kapanır
  @test6
  Scenario: Admin kullanici duzenleme yapabilmeli
    Then   kullanici edit sekmesine tiklar
    And  secilen kisinin duzenlenebildigini dogrular
    And sayfa kapanır
  @test7
  Scenario: Admin kullanici silebilmeli
    Then kullanici delete butonuna tiklar
    And secilen kisinin silindigini dogrular
    And sayfa kapanır