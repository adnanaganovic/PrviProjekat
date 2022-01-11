package seven.human;

public enum Gender {
  // KONSTRUKTOR kod Enuma mora biti "private", Imenovanje varijable u ENUMU sve velika slova npr. GENDER
    FEMALE("Ženski", "Nježniji rod"),
    MALE ("Muški", "Grublji spol"),
;

    private String name;
    private String description;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  Gender (String n, String d){                  //KONSTRUKTOR
      this.name = n;
      this.description = d;




    }


}
