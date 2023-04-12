package com.training.pom;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class homepagePOM {
	private WebDriver driver; 
	
	public homepagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h2[text()='MX Original Web Shows']")
	private WebElement MOWS; 
	
	@FindBy(xpath="//h2[text()='Blockbuster Movies']")
	private WebElement BM; 
	
	@FindBy(xpath="//h2[text()='Trending In Movies']")
	private WebElement TIM; 
	
	@FindBy(xpath="//a[@href='/list/db10c30119f65c0790bb4dcdf80c5785?sectionName=Trending+In+Movies&sectionStyle=grid_vertical&pageDirection=1&finalId=448f9063ac17c6f8d46443cf250a5706']")
	private WebElement TIMF; 
	
	@FindBy(xpath="//a[@href='/list/f9eddeb5c3d23902a46ee44de711f62e?sectionName=MX+Original+Web+Shows&sectionStyle=grid_vertical&pageDirection=1&finalId=775ad3b682fde6a608559a60986b230d']")
	private WebElement MOWSF; 
	
	@FindBy(xpath="//a[@href='/list/3fcef01871ef43da07bf35fe8a948e77?sectionName=Blockbuster+Movies&sectionStyle=grid_vertical&pageDirection=1&finalId=23378099fe9b7da4595c0549da9820e3']")
	private WebElement BMF; 
	
	@FindBy(xpath="//a[@href='/list/66969d13534bdb5c3cb8f322b4274e7d?sectionName=Top+10+This+Week&sectionStyle=grid_vertical&pageDirection=1&finalId=b1e0f2bf9ddf46f801064df1ebcf47bc']")
	private WebElement T10TWF; 
	
	@FindBy(xpath="//a[@href='/list/4e1ab56ad7923ec732e480a8486a1b33?sectionName=Romantic+Shows+-+VDesi&sectionStyle=grid_vertical&pageDirection=1&finalId=74b7cab86be52a6ebf2ff101cc98da22']")
	private WebElement RSF; 
	
	@FindBy(xpath="//a[@href='/list/249961dcdafb1ad0ba6f5da29af50410?sectionName=Trending+Shows+on+MX&sectionStyle=grid_vertical&pageDirection=1&finalId=0930fb169d387f3cd0bdc0f920814a8b']")
	private WebElement TOSMF; 
	
	@FindBy(xpath="//a[@href='/list/8e160d72b667e9437bb5f92e00f2f22c?sectionName=Best+in+Gujarat&sectionStyle=grid_vertical&pageDirection=1&finalId=a510c615c5533606595315de4f1493e2']")
	private WebElement BIGF; 
	
	public void  mxoriginalwebshowu() {
		 String x=this.MOWS.getText();
		 Assert.assertEquals(x, "MX Original Web Shows");
	}
	public void  blockbustermovie() {
		 String x=this.BM.getText();
		 Assert.assertEquals(x, "Blockbuster Movies");
	}
	public void trendinginmovie() {
		 String x=this.TIM.getText();
		 Assert.assertEquals(x, "Trending In Movies");
	}
	
	public void trendinginmovief() {
		 this.TIMF.click();
		 
	}
	public void mxoriginalwebshowf() {
		 this.MOWSF.click();
		 
	}
	public void blockbusterf() {
		 this.BMF.click();
		 
	}
	public void top10thisweekf() {
		 this.T10TWF.click();
		 
	}
	public void romanticshowf() {
		 this.RSF.click();
		 
	}
	public void tradingonshowmxf() {
		 this.TOSMF.click();
		 
	}
	public void bestingujaratf() {
        

		 this.BIGF.click();
		 
	
	}
}
