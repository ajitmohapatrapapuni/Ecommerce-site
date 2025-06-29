# 🛒 Selenium E-commerce Automation (Java)

This project is a simple Selenium automation script in Java that:

1. Logs into [Automation Test Store](https://automationteststore.com)
2. Selects a product
3. Adds it to cart
4. Logs out



## 📁 Project Structure

AutomationAssignment/
├── pom.xml
└── src/
└── main/
└── java/
└── org/
└── example/
└── ECommerceTest.java



## 🛠️ Prerequisites

### ✅ Software Required

| Tool             | Description                          |
|------------------|--------------------------------------|
| Java JDK         | Version 8 or above (tested with JDK 21) |
| IntelliJ IDEA    | Community or Ultimate Edition        |
| Chrome Browser   | Recommended: Latest Stable Version   |
| ChromeDriver     | Must match your Chrome version       |

---

## 🌐 Download ChromeDriver

1. Check your Chrome version by visiting:  
   `chrome://settings/help`

2. Download matching ChromeDriver:  
   👉 [https://googlechromelabs.github.io/chrome-for-testing/](https://googlechromelabs.github.io/chrome-for-testing/)

3. Extract and place the `chromedriver.exe` in a known folder, e.g.:
C:\seleniumWebdriver\chromedriver-win64\chromedriver.exe



## 📦 Setup Steps in IntelliJ IDEA

### 🔧 Step 1: Open IntelliJ & Create New Project

1. Launch IntelliJ IDEA
2. Select **New Project**
3. Choose **Maven**
4. Name it `AutomationAssignment`
5. Click **Finish**

### 🧾 Step 2: Add Dependencies

Edit your `pom.xml` and add:
```xml
<dependencies>
 <dependency>
     <groupId>org.seleniumhq.selenium</groupId>
     <artifactId>selenium-java</artifactId>
     <version>4.20.0</version>
 </dependency>
</dependencies>

.





