package com.intel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test(priority=1)
public class StudentIntel extends Login_Pgae_Intel {

	public void Student() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='STUDENT']")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//a[text()='List']")).click();
		Thread.sleep(500);


		// search button-1


		driver.findElement(By.xpath("//span[text()='Search']")).click();

		Thread.sleep(2000);

		// search button-2

		driver.findElement(By.xpath("//span[text()='Search']")).click();


		// teacher student id

		WebElement studentid = driver.findElement(By.id("teac-stu-session-id"));
		studentid.click();

		Select gh= new Select(studentid);

		gh.selectByIndex(2);

		//class id
		WebElement classid = driver.findElement(By.id("teac-stu-class-id"));
		studentid.click();

		Select b= new Select(classid);

		b.selectByIndex(3);

		// section
		WebElement section = driver.findElement(By.id("teac-stu-section-id"));
		section.click();

		Select c= new Select(section);

		c.selectByIndex(7);

		//select student

		WebElement student = driver.findElement(By.id("name-id"));
		student.click();

		Select s=new Select(student);
		s.selectByIndex(5);

		// search button-3

		driver.findElement(By.xpath("//span[text()='Search']")).click();

		//view icon
		driver.findElement(By.xpath("//span[@class='f_icons a_icons icon-hover ']")).click();
	}

	@Test(priority=2)

	public void studentinfo() {
		// Student info
		driver.findElement(By.id("basicInfo")).click();

		// Attendance
		driver.findElement(By.xpath("//span[text()='Attendance']")).click();

		// exam result
		driver.findElement(By.xpath("//span[text()='Exam Result']")).click();

		// home work 
		driver.findElement(By.xpath("//span[text()='Homework']")).click();

		//result
		driver.findElement(By.xpath("//span[text()='Report']")).click();


	}

	@Test(priority=3)
	public void studentttendance() throws InterruptedException {

		// Attendance

		driver.findElement(By.xpath("//span[text()='Attendance']")).click();


		//(//span[text()='Not Marked'])[4]
		// selecting year
		WebElement year = driver.findElement(By.id("get-attend-session"));
		year.click();

		Select y = new Select(year);

		y.selectByIndex(2);

		// selecting month
		WebElement getmonth = driver.findElement(By.id("get-attend-month"));
		getmonth.click();

		Select m = new Select(getmonth);

		m.selectByIndex(9);

		// selecting date

		driver.findElement(By.xpath("(//span[text()='Not Marked'])[4]")).click();

		// select present/on duty/ leave option
		Thread.sleep(2000);
		WebElement selectingattendence = driver.findElement(By.id("sel-attendance"));

		selectingattendence.click();

		Select sa = new Select(selectingattendence);
		sa.selectByVisibleText("OnDuty");

		Thread.sleep(1000);

		// selecting in time
		/*	WebElement intime = driver.findElement(By.id("in-time"));
		intime.click();
		Thread.sleep(800);

		Select it = new Select(intime);
		it.selectByIndex(2);
		Thread.sleep(800);

		//selecting out time
		WebElement outtime = driver.findElement(By.id("out-time"));
		outtime.click();
		Thread.sleep(800);

		Select ot = new Select(outtime);
		ot.selectByIndex(1);*/
		Thread.sleep(800);


		// reason

		driver.findElement(By.id("nm-description")).sendKeys("fvukjhbyuaw6567965198ru987235643i94.';,[]-=*-+");
		Thread.sleep(800);


		// click submit button

		driver.findElement(By.id("nm-attendance-btn")).click();
		Thread.sleep(1800);


	}

	@Test(priority=4)

	public void examresult() throws InterruptedException {

		// exam result
		driver.findElement(By.xpath("//span[text()='Exam Result']")).click();

		Thread.sleep(1000);

		// year selting
		WebElement examsession = driver.findElement(By.id("stu-exam-session-id"));
		examsession.click();

		Select eid =new Select(examsession);
		eid.selectByIndex(2);
		Thread.sleep(1000);


		// term of the exam

		WebElement term = driver.findElement(By.id("stu-exam-id"));
		term.click();

		Select te =new Select(term);
		te.selectByVisibleText("Half Yearly");
		Thread.sleep(1000);

		// window handle
		
		String parentWindowHandle = driver.getWindowHandle();
		Thread.sleep(1000);
		
		driver.findElement(By.id("report-card")).click();
		Thread.sleep(1000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String string : windowHandles) {
			System.out.println(driver.switchTo().window(string).getTitle());
		}
		
		driver.switchTo().window(parentWindowHandle);
		
		Thread.sleep(5000);
		
		
	}
/*
	@Test(priority=5)
	
	public void homework() {
		
		// home work 
				driver.findElement(By.xpath("//span[text()='Homework']")).click();
				
				
		
	}*/
}


