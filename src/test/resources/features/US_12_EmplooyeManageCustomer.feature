@TC_01
Feature: US_12 An Employee Can Manage Customer
  Scenario: : Go to employee Manage Customers Page
    Given employee on the application page
    And click login button
    And employee enters username
    And employee enters password
    And click sign in button
    And click My Operations
    And click Manage Customers


    And sayfada ID yazisi goruluyor mu
    And sayfada First Name yazisi goruluyor mu
    And sayfada Last Name yazisi goruluyor mu
    And sayfada Middle Initial yazisi goruluyor mu
    And sayfada Email yazisi goruluyor mu
    And sayfada Mobile Phone Number yazisi goruluyor mu
    And sayfada Phone Number yazisi goruluyor mu
    And sayfada Address yazisi goruluyor mu
    And sayfada Create Date yazisi goruluyor mu

    @TC_02
    Scenario: Bir müşterinin tüm bilgilerinin ve Edit butonunun görebileceği bir View seçeneği olmalıdır.

      Given View butonu olmalidir
      Then View butonu tikladiginda butun musteri bilgilerinin olgugu sayfa acilmalidir
      And Bir musterinin First Name bilgisi gorulebilmelidir
      And Bir musterinin Last Name bilgisi gorulebilmelidir
      And Bir musterinin Middle Initial bilgisi gorulebilmelidir
      And Bir musterinin Email bilgisi gorulebilmelidir
      And Bir musterinin Mobile Phone Number bilgisi gorulebilmelidir
      And Bir musterinin Phone Number bilgisi gorulebilmelidir
      And Bir musterinin Zip Code bilgisi gorulebilmelidir
      And Bir musterinin Address bilgisi gorulebilmelidir
      And Bir musterinin City bilgisi gorulebilmelidir
      And Bir musterinin Ssn bilgisi gorulebilmelidir
      And Bir musterinin Create Date bilgisi gorulebilmelidir

      And Bir musterinin Country bilgisi gorulebilmelidir
      And Bir musterinin State bilgisi gorulebilmelidir
      And Bir musterinin User bilgisi gorulebilmelidir
      And Bir musterinin Account bilgisi gorulebilmelidir
      And Bir musterinin Zelle Enrolled bilgisi gorulebilmelidir
      And sayfada Edit butonu gorulebilmeldir


      @TC_03
      Scenario: Edit butonu ile tüm müşteri bilgileri düzenlenebilmeli veya olusturulabilmelidir

      Given Tüm müşteri bilgilerinin düzenlenebileceği bir Edit düğmesi olmalıdır.
        Then Edit botunu click edildiginde Edit sayfasi goruntulenmelidir
        And sayfada First Name box da bilgiler olusturulabilmeli veya guncellenebilmelidir
        And sayfada Last Name box da bilgiler olusturulabilmeli veya guncellenebilmelidir
        And sayfada Middle Initial box da bilgiler olusturulabilmeli veya guncellenebilmelidir
        And sayfada Email box da bilgiler olusturulabilmeli veya guncellenebilmelidir
        And sayfada Mobile Phone Number box da bilgiler olusturulabilmeli veya guncellenebilmelidir
        And sayfada Phone Number box da bilgiler olusturulabilmeli veya guncellenebilmelidir
        And sayfada Zip Code box da bilgiler olusturulabilmeli veya guncellenebilmelidir
        And sayfada Address box da bilgiler olusturulabilmeli veya guncellenebilmelidir
        And sayfada City box da bilgiler olusturulabilmeli veya guncellenebilmelidir
        And sayfada Ssn box da bilgiler olusturulabilmeli veya guncellenebilmelidir
        And sayfada Create Date box da bilgiler olusturulabilmeli veya guncellenebilmelidir
        # And Bir musterinin Country bilgisi secilebilmelidir
        And sayfada State box da bilgiler olusturulabilmeli veya guncellenebilmelidir
       # And sayfada User box da bilgiler olusturulabilmeli veya guncellenebilmelidir
      #  And sayfada Account box da bilgiler olusturulabilmeli veya guncellenebilmelidir
        And Bir musterinin Zelle Enrolled box click edilebilmelidir
        And kullanici costumers sayfasina gitmelidir
        And bir musteriyi silmek icin Delete butonuna click etmmelidir

























