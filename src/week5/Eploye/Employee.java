package week5.Eploye;

public class Employee {
        private String firstName;
        private String lastName;
        private ContactInfo contactInfo; // Inner class örneği

        // Employee constructor
        public Employee(String firstName, String lastName, String phone, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.contactInfo = new ContactInfo(phone, email);
        }

        // Çalışan bilgilerini gösteren metot
        public void displayEmployeeInfo() {
            System.out.println("Çalışan Adı: " + firstName);
            System.out.println("Çalışan Soyadı: " + lastName);
            contactInfo.displayContactInfo(); // Inner class metodunu çağır
        }

        // Inner Class: ContactInfo
        public class ContactInfo {
            private String phone;
            private String email;

            public ContactInfo(String phone, String email) {
                this.phone = phone;
                this.email = email;
            }

            public void displayContactInfo() {
                System.out.println("Telefon: " + phone);
                System.out.println("E-posta: " + email);
            }
        }

        // Test
        public static void main(String[] args) {
            Employee emp = new Employee("yılmaz", "Yılmaz", "0555-123-4747", "yılmaz.yilmaz@example.com");
            emp.displayEmployeeInfo();

        }
    }

