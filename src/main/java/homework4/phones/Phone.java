package homework4.phones;

import homework4.phones.actions.ActionsPhone;

public abstract class Phone implements ActionsPhone {
   String name;
   int year;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }
}
