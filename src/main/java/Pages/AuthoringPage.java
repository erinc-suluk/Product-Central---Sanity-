package Pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;
import com.pwc.productcentral.ReadXLSdata;

public class AuthoringPage extends HelperFunctions {
	public AuthoringPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	
	@FindBy(xpath="//*[@id=\"globalnav-start-home-collection\"]/coral-masonry-item[2]/div")
	private WebElement sites;
	
	@FindBy(xpath="(//div[contains(@title, 'productcentral')])[2]")
	private WebElement productcentral;
	
	@FindBy(xpath="//div[@title='us']")
	private WebElement us;
	
	@FindBy(xpath="//div[@title='en']")
	private WebElement en;
	
	@FindBy(xpath="//coral-columnview-item[@data-foundation-collection-item-id='/content/pc/us/en/products']")
	private WebElement Products;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/products/change-navigator.thumb.48.48.png?ck=']")
	private WebElement ChangeNavigator;
	
	@FindBy(xpath="//button[@class='betty-ActionBar-item cq-siteadmin-admin-actions-edit-activator foundation-collection-action coral-Button--graniteActionBar coral3-Button coral3-Button--quiet']")
	private WebElement edit;
	
	@FindBy(xpath="//h1[.='Fluid Forecast']")
	private WebElement pageTitle;
	
	@FindBy(xpath="//div[@data-path='/content/pc/us/en/products/change-navigator/jcr:content/root/container/container/title']")
	private WebElement changeProductsTitle;
	
	@FindBy(xpath="(//input[@name='./jcr:title'])[2]")
	private WebElement titleEdit;
	
	@FindBy(xpath="//button[@icon='edit']")
	private WebElement editButton;
	
	@FindBy(xpath="//button[@class='cq-dialog-header-action cq-dialog-submit coral3-Button coral3-Button--minimal']")
	private WebElement checkButton;
	
	@FindBy(xpath="//div[@data-path='/content/pc/us/en/products/change-navigator/jcr:content/root/container/container/text']")
	private WebElement changeNavigatorDescription;
	
	@FindBy(xpath="//div[@class='cq-RichText-editable coral-RichText-editable coral-RichText coral-DecoratedTextfield-input is-edited webkit chrome']")
	private WebElement navigatorDescriptionEdit;
	
	@FindBy(xpath="//button[@class='cq-dialog-header-action cq-dialog-submit coral3-Button coral3-Button--minimal']")
	private WebElement checkButton2;
	
	@FindBy(xpath="//button[@data-layer='Preview']")
	private WebElement previewButton;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement actualNavigatorTitle;
	
	@FindBy(xpath="//div[@class='cmp-text']")
	private WebElement actualNavigatorDescription;
	
	@FindBy(xpath="(//coral-columnview-column[@data-foundation-layout-columnview-columnid='/content/pc/us/en'])//coral-columnview-item")
	private static List<WebElement> contentOptions;
	
	@FindBy(xpath="//*[@id=\"coral-id-496\"]/div[1]")
	private WebElement automation;
	@FindBy(xpath="//coral-columnview-item[@data-granite-collection-item-id='/content/pc/us/en/automation/my-products']")
	private WebElement myproduct;
	@FindBy(xpath="//img[@src='/content/pc/us/en/automation/my-products/fluid-forecast.thumb.48.48.png?ck=']")
	private WebElement fluidForecast;
	
	@FindBy(xpath="(//div[@class='cmp-for-you__tiles'])/a")
	private static List<WebElement> foryouAssets;
	
	@FindBy(xpath="((//div[@class='cmp-for-you__tiles'])/a)[position()=1 or position()=2 or position()=3 or position()=4 or position()=5]")
	private static List<WebElement> first5Assets;
	
	@FindBy(xpath="((//div[@class='cmp-for-you__tiles'])/a)[position()=6 or position()=7 or position()=8 or position()=9 or position()=10]")
	private static List<WebElement> last5Assets;
	
	@FindBy(xpath="//button[@id='showMore']")
	private WebElement viewMoreButton;
	
	@FindBy(xpath="//button[@id='showLess']")
	private WebElement viewLessButton;
	
	@FindBy(xpath="//button[@class='granite-collection-create foundation-toggleable-control coral3-Button coral3-Button--primary']")
	private WebElement createButton;
	
	@FindBy(xpath="(//coral-list-item-content[.='Page'])[1]")
	private WebElement pageButton;
	
	@FindBy(xpath="//img[@src='/conf/pc/settings/wcm/templates/product-listing-page-template-product-central/thumbnail.png']")
	private WebElement productListingPageTemplate;
	
	@FindBy(xpath="//coral-button-label[.='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath="//coral-tab-label[.='Product Central']")
	private WebElement productCentralTab;
	
	@FindBy(xpath="//select[@name='./documentCategory']")
	private static List<WebElement> documentCategoryTag;
	
	@FindBy(xpath="//select[@name='./productFeatureTag']")
	private static List<WebElement> productFeatureTags;
	
	@FindBy(xpath="//select[@name='./portfolioTag']")
	private static List<WebElement> portfolioTags;
	
	@FindBy(xpath="//div[@title='Products']")
	private WebElement products;
	
	@FindBy(xpath="//div[@title='Change Navigator']")
	private WebElement changeNavigatorLink;
	
	@FindBy(xpath="(((//coral-columnview-column-content[@role='presentation'])[7])//coral-columnview-item)[position()=1]")
	private WebElement firstPositionAuthor;
	
	@FindBy(xpath="(((//coral-columnview-column-content[@role='presentation'])[7])//coral-columnview-item)[position()=2]")
	private WebElement secondPositionAuthor;
	
	@FindBy(xpath="(((//coral-columnview-column-content[@role='presentation'])[7])//coral-columnview-item)[position()=3]")
	private WebElement thirdPositionAuthor;
	
	@FindBy(xpath="(((//coral-columnview-column-content[@role='presentation'])[7])//coral-columnview-item)[position()=4]")
	private WebElement forthPositionAuthor;
	
	@FindBy(xpath="((//div[@class='cmp-document-tiles'])//div//a)[position()=1]")
	private WebElement firstTitle;
	
	@FindBy(xpath="((//div[@class='cmp-document-tiles'])//div//a)[position()=2]")
	private WebElement secondTitle;
	
	@FindBy(xpath="((//div[@class='cmp-document-tiles'])//div//a)[position()=3]")
	private WebElement thirdTitle;
	
	@FindBy(xpath="((//div[@class='cmp-document-tiles'])//div//a)[position()=4]")
	private WebElement forthTitle;
	
	@FindBy(xpath="((//div[@class='cmp-document-tiles'])//div//a)[position()=5]")
	private WebElement fifthTitle;
	
	@FindBy(xpath="((//div[@class='cmp-document-tiles'])//div//a)[position()=6]")
	private WebElement sixthTitle;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/products/change-navigator/offering-overview.thumb.48.48.png?ck=1665588252']")
	private WebElement offerinfOverviewImage;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/products/change-navigator/terms---conditions.thumb.48.48.png?ck=']")
	private WebElement termsAndConditionsImage;
	
	@FindBy(xpath="//a[@href='/us/en/products/change-navigator/offering-overview.html']")
	private WebElement offeringOverviewLink;
	
	@FindBy(xpath="((//div[@class='cmp-all-resources__cards-page ap-page-container'])//div//a)[position()=1 or position()=2 or position()=3 or position()=4 or position()=5]")
	private static List<WebElement> first5resources;
	
	@FindBy(xpath="((//coral-columnview-column-content[@role='presentation'])[4])//coral-columnview-item//div")
	private static List<WebElement> contentOptions2;
	
	@FindBy(name= "j_username")
	private WebElement username;
	@FindBy(name="j_password")
	private WebElement password;
	@FindBy(id="submit-button")
	private WebElement signInButton;
	
	@FindBy(xpath="//input[@id='initEmail']")
	private WebElement email;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement next;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//div[@data-path='/content/pc/us/en/automation/sitemapfortesting/jcr:content/root/container/container/sitemap']")
	private WebElement sitemap;
	
	@FindBy(xpath="//button[@icon='wrench']")
	private WebElement settingIcon;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/automation/homepage-demo.thumb.48.48.png?ck=']")
	private WebElement homepageDemo;
	
	@FindBy(xpath="/html/body/div[1]/div/coral-actionbar/coral-actionbar-primary/coral-actionbar-item[3]/button/coral-icon")
	private WebElement properties;
	
	@FindBy(xpath="//coral-checkbox[@name='./hideInSitemap']")
	private WebElement hidesitemapCheckbox;
	
	@FindBy(xpath="//button[@id='shell-propertiespage-doneactivator']")
	private WebElement saveAndClose;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/automation/sitemapfortesting.thumb.48.48.png?ck=']")
	private WebElement sitemapImage;
	
	@FindBy(xpath="/html/body/div[1]/div/coral-actionbar/coral-actionbar-primary/coral-actionbar-item[2]/button/coral-icon")
	private WebElement edit2;
	
	@FindBy(xpath="//button[@data-layer='Preview']")
	private WebElement previewButton2;
	
	@FindBy(xpath="//*[@id=\"Content\"]/div[1]/coral-actionbar/coral-actionbar-secondary/coral-actionbar-item[1]/button")
	private WebElement editButton2;
	
	@FindBy(xpath="/html/body/div[1]/div/coral-actionbar/coral-actionbar-primary/coral-actionbar-item[11]/button")
	private WebElement quickPublish;
	
	@FindBy(xpath="/html/body/div[2]/div/coral-actionbar/coral-actionbar-primary/coral-actionbar-item[11]/button/coral-icon")
	private WebElement Publish;
	
	@FindBy(xpath="//div[@id='pcLayout__content-page']")
	private static List<WebElement> sitemapContents;
	
	@FindBy(xpath="//div[@data-path='/content/pc/us/en/automation/legal/jcr:content/root/container/container/legal_content_tiles']")
	private WebElement legalTilesAuth;
	
	@FindBy(xpath="//div[@class='cmp-document-tiles__entries']")
	private static List<WebElement> legalTiles;
	
	@FindBy(xpath="/html/body/coral-dialog[2]/div[2]/form/coral-dialog-content/div/coral-tabview/coral-panelstack/coral-panel/coral-panel-content/div/div/div/div/coral-multifield/coral-multifield-item[1]/coral-multifield-item-content/div/div/foundation-autocomplete/div/div/span")
	private WebElement legalTilesAuthFirstCheckbox;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/automation/legal/data-processing-addendum.thumb.48.48.png']")
	private WebElement dataProcessingImg;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/automation/legal/maintenance---support.thumb.48.48.png']")
	private WebElement maintenanceImg;
	
	@FindBy(xpath="//button[@class='granite-pickerdialog-submit coral3-Button coral3-Button--primary']")
	private WebElement selectButton;
	
	@FindBy(xpath="//button[@title='Done']")
	private WebElement checkIcon;
	
	@FindBy(xpath="//a[@href='/us/en/automation/products/cloud/offering-overview.html']")
	private WebElement offeringOverviewLink2;
	
	@FindBy(xpath="//div[@data-path='/content/pc/us/en/automation/products/cloud/offering-overview/jcr:content/root/container/container/pdf_highlights']")
	private WebElement offeringOverviewLink2auth;
	
	@FindBy(xpath="(//input[@name='./jcr:title'])[2]")
	private WebElement titleField;
	
	@FindBy(xpath="//span[@class='cmp-pdf-highlights__title']")
	private WebElement contentTitle;
	
	@FindBy(xpath="(//button[@data-layer='Edit'])[2]")
	private WebElement editButtonContent;
	
	@FindBy(xpath="//div[@data-path='/content/pc/us/en/automation/products/cloud/offering-overview/jcr:content/root/container/container/pdfviewer']")
	private WebElement offeringOverviewPdfauth;
	
	@FindBy(xpath="/html/body/coral-dialog[2]/div[2]/form/coral-dialog-content/div/coral-tabview/coral-panelstack/coral-panel[1]/coral-panel-content/div/div/div/div/foundation-autocomplete/div/div/span/button")
	private WebElement pdfOptions;
	
	@FindBy(xpath="//img[@src='/content/dam/productcentral/general/content-pdf/PDF%20Template%20for%20AEM%20Testing.pdf.thumb.48.48.png']")
	private WebElement pdfImage;
	
	@FindBy(xpath="//div[@data-path='/content/pc/us/en/automation/homepage-demo/jcr:content/root/container/container/tiles']")
	private WebElement homepageTileauth;
	
	@FindBy(xpath="(//h3[@class='coral-Collapsible-header'])[1]")
	private WebElement collapseHeader;
	
	@FindBy(xpath="//input[@name='./tilesList/item0/./title']")
	private WebElement titleofTile;
	
	@FindBy(xpath="//textarea[@name='./tilesList/item0/./description']")
	private WebElement descriptionofTile;
	
	@FindBy(xpath="(//div[@class='cmp-tiles__entry-title'])[1]")
	private WebElement firstTitleofTile;
	
	@FindBy(xpath="div[@class='cmp-tiles__products-link']")
	private static List<WebElement> loginToMyProductsLinks;
	
	@FindBy(xpath="/html/body/coral-dialog[2]/div[2]/form/coral-dialog-content/div/coral-tabview/coral-panelstack/coral-panel/coral-panel-content/div/div/div/div[1]/foundation-autocomplete/div/div/span/button")
	private WebElement checkforOptions;
	

	@FindBy(xpath="//img[@src='/content/pc/us/en/automation/my-products.thumb.48.48.png']")
	private WebElement myproductImage;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/automation.thumb.48.48.png']")
	private WebElement automationImage;
	
	@FindBy(xpath="//button[@trackingelement='edit']")
	private WebElement editnextToPreview;
	
	@FindBy(xpath="//div[@title='Products']")
	private WebElement productsPackage;
	
	@FindBy(xpath="//div[@title='Cloud']")
	private WebElement cloudPackage;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/automation/reseller-demo.thumb.48.48.png?ck=']")
	private WebElement resellerdemoImage;
	
	@FindBy(xpath="//coral-icon[@icon='globeClock']")
	private WebElement managePublication;
	
	@FindBy(xpath="//button[@icon='globeStrike']")
	private WebElement unpublish;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/automation/reseller-demo.thumb.48.48.png?ck=1667482422000']")
	private WebElement resellerdemoImageforUnpublish;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement unpublishButton;
	
	@FindBy(xpath="//button[@variant='warning']")
	private WebElement continueButton;
	
	@FindBy(xpath="//coral-columnview-preview-content[@role='presentation']")
	private static List<WebElement> publishInformation;
	
	@FindBy(xpath="//div[@title='Reseller Demo']")
	private WebElement resellerDemo;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/automation/reseller-demo/check-in.thumb.48.48.png?ck=']")
	private WebElement checkinImg;
	
	@FindBy(xpath="//button[@trackingelement='quick publish']")
	private WebElement quickPublish2;
	
	@FindBy(xpath="//button[@class='coral3-Button coral3-Button--primary']")
	private WebElement publish2;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/automation/reseller-demo/microsoft-alliance.thumb.48.48.png?ck=']")
	private WebElement microsoftImg;
	
	@FindBy(xpath="//img[@src='/content/pc/us/en/automation/reseller-demo/dragos-alliance.thumb.48.48.png?ck=']")
	private WebElement dragosImg;
	
	
	
	
	
	
	
	
	
	ReadXLSdata read1=new ReadXLSdata();
	
	
	
	String expectedNavigatorTitle="new title";
	String expectedNavigatorDescription="New Description";
	





	public void aemTitle() {Assert.assertEquals(Driver.getDriver().getTitle(), "AEM Start", "AEM title verification has been failed");}
	
    public void setSites() {
    	sites.click();
    	productcentral.click();
    	us.click();
    	en.click();
    	HelperFunctions.staticWait(10);
    	automation.click();
    	myproduct.click();
    	fluidForecast.click();
    	HelperFunctions.staticWait(3);
		edit.click();
		 Set<String> allWindows4=Driver.getDriver().getWindowHandles();
	        List<String> windowsList4=new ArrayList<>(allWindows4);
	        Driver.getDriver().switchTo().window(windowsList4.get(1));
	        HelperFunctions.staticWait(15);
	        Driver.getDriver().switchTo().frame(0);
	        //HelperFunctions.clickWithWait(pageTitle);
	        int count=foryouAssets.size();
	        System.out.println(count);
	        HelperFunctions.staticWait(3);
	        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	        
	  
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        if(viewMoreButton.isDisplayed()) {
	        	for(WebElement eachAsset: first5Assets) {
	        		if(eachAsset.isDisplayed()) {
	        			Assert.assertTrue(true);
	        		}
	        	}
	        	for(WebElement eachAsset2:last5Assets) {
	        		if(!eachAsset2.isDisplayed()) {
	        			Assert.assertTrue(true);
	        		}
	        	}
	        }else {
	        	Assert.assertTrue(false);
	        }
	        
	
	      
	        HelperFunctions.staticWait(3);
	        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
	        executor.executeScript("arguments[0].click();", viewMoreButton);
	        if(viewLessButton.isDisplayed()) {
	        	for(WebElement eachAsset: first5Assets) {
	        		if(eachAsset.isDisplayed()) {
	        			Assert.assertTrue(true);
	        		}
	        	}
	        	for(WebElement eachAsset2:last5Assets) {
	        		if(eachAsset2.isDisplayed()) {
	        			Assert.assertTrue(true);
	        		}
	        	}
	        }else {
	        	Assert.assertTrue(false);
	        }
	        
	        
	        
	        
	        
    
    
    	}
	
	

    public void setChangeProductsTitle() {
		Actions a = new Actions(Driver.getDriver());
		a.doubleClick(changeProductsTitle).build().perform();
		HelperFunctions.staticWait(3);
		Set<String> allWindows5=Driver.getDriver().getWindowHandles();
        List<String> windowsList5=new ArrayList<>(allWindows5);
        Driver.getDriver().switchTo().window(windowsList5.get(1));
        System.out.println(changeProductsTitle.getText());
        
	}
	public void setTitleEdit() {
		Set<String> allWindows5=Driver.getDriver().getWindowHandles();
        List<String> windowsList5=new ArrayList<>(allWindows5);
        Driver.getDriver().switchTo().window(windowsList5.get(1));
		titleEdit.click();
		titleEdit.clear();
		titleEdit.sendKeys(expectedNavigatorTitle);
		HelperFunctions.staticWait(3);
		
	}
	
	public void setCheckButton() {checkButton.click();HelperFunctions.staticWait(3);}
	
	public void setChangeNavigatorDescription() {
        Driver.getDriver().switchTo().defaultContent();
        Actions a = new Actions(Driver.getDriver());
		a.doubleClick(changeNavigatorDescription).build().perform();
		HelperFunctions.staticWait(3);
	}
	public void setNavigatorDescriptionEdit() {
		Set<String> allWindows5=Driver.getDriver().getWindowHandles();
        List<String> windowsList5=new ArrayList<>(allWindows5);
        Driver.getDriver().switchTo().window(windowsList5.get(1));
        HelperFunctions.staticWait(3);
		navigatorDescriptionEdit.click();
		navigatorDescriptionEdit.clear();
		navigatorDescriptionEdit.sendKeys(expectedNavigatorDescription);
		HelperFunctions.staticWait(3);
	}
	
	public void setCheckButton2() {checkButton2.click();HelperFunctions.staticWait(3);}
	
	public void setPreviewButton() {previewButton.click();}

    public void setActualNavigatorTitle() {
    	Driver.getDriver().switchTo().frame(0);
    	Assert.assertEquals(actualNavigatorTitle.getText(),expectedNavigatorTitle,"Actual and expected Navigator Title do not match");
	}

    public void setActualNavigatorDescription() {
		Assert.assertEquals(actualNavigatorDescription.getText(),expectedNavigatorDescription,"Actual and expected Navigator description do not match");
	}
    public void setDocCategory() throws Exception {
  
        read1.setExcelFile("./testdata.xlsx", "QA");
 		email.sendKeys(read1.getCellData("DATA", 1));
 		next.click();
 		pass.sendKeys(read1.getCellData("VALUE", 1));
 		submit.click();
 	    HelperFunctions.staticWait(5);
 	    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
 js.executeScript("window.open()");
 	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
 	    Driver.getDriver().switchTo().window(tabs.get(1));
 	    Driver.getDriver().get(read1.getCellData("VALUE", 17));
 	    HelperFunctions.waitForPageToLoad(5);
    	createButton.click();
    	pageButton.click();
    	HelperFunctions.waitForPageToLoad(5);
    	productListingPageTemplate.click();
    	nextButton.click();
    	HelperFunctions.waitForPageToLoad(5);
    	productCentralTab.click();
    	
		
    	List<String> docCat = documentCategoryTag
	    .stream() 
	    .map(x -> x.getText())
	    .collect(Collectors.toList());
    	//Collections.sort(docCat);
    	//System.out.println(docCat.toString());
    	read1.setExcelFile("./testdata.xlsx", "Tag Taxonomy");
    if(docCat.toString().contains((read1.getCellData("PC", 1)))&&
       docCat.toString().contains((read1.getCellData("PC", 2)))&&
       docCat.toString().contains((read1.getCellData("PC", 3)))&&
       docCat.toString().contains((read1.getCellData("PC", 4)))&&
       docCat.toString().contains((read1.getCellData("PC", 5)))&&
       docCat.toString().contains((read1.getCellData("PC", 6)))&&
       docCat.toString().contains((read1.getCellData("PC", 7)))&&
       docCat.toString().contains((read1.getCellData("PC", 8)))&&
       docCat.toString().contains((read1.getCellData("PC", 9)))&&
       docCat.toString().contains((read1.getCellData("PC", 10)))&&
       docCat.toString().contains((read1.getCellData("PC", 11)))&&
       docCat.toString().contains((read1.getCellData("PC", 12)))&&
       docCat.toString().contains((read1.getCellData("PC", 13)))&&
       docCat.toString().contains((read1.getCellData("PC", 14)))&&
       docCat.toString().contains((read1.getCellData("PC", 15)))
      )
   {
    	Assert.assertTrue(true);
    	
    }else {
    	Assert.assertTrue(false);
    }
    
    List<String> productFeature = productFeatureTags
    	    .stream() 
    	    .map(x -> x.getText())
    	    .collect(Collectors.toList());
        	read1.setExcelFile("./testdata.xlsx", "Tag Taxonomy");
        	if(
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 1)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 2)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 3)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 4)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 5)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 6)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 7)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 8)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 9)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 10)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 11)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 12)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 13)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 14)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 15)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 16)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 17)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 18)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 19)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 20)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 21)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 22)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 23)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 24)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 25)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 26)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 27)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 28)))&&
        			productFeature.toString().contains((read1.getCellData("ProductFeature", 29)))) {
        		Assert.assertTrue(true);
        	}else {
        		Assert.assertTrue(false);
        	}
        	
        	List<String> portfolio = portfolioTags
        		    .stream() 
        		    .map(x -> x.getText())
        		    .collect(Collectors.toList());
        	read1.setExcelFile("./testdata.xlsx", "Tag Taxonomy");
        	if(portfolio.toString().contains((read1.getCellData("Portfolio", 1)))&&
        			portfolio.toString().contains((read1.getCellData("Portfolio", 2)))&&
        			portfolio.toString().contains((read1.getCellData("Portfolio", 3)))&&
        			portfolio.toString().contains((read1.getCellData("Portfolio", 4)))&&
        			portfolio.toString().contains((read1.getCellData("Portfolio", 5)))) {
        		Assert.assertTrue(true);
        	}else {
        		Assert.assertTrue(false);
        	}
        			
        			
    	
    	
    	
    	
    }
  
    	
    
    public void setCombination() throws Exception {
    	read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("DATA", 1));
		next.click();
		pass.sendKeys(read1.getCellData("VALUE", 1));
		submit.click();
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs.get(1));
	    Driver.getDriver().get(read1.getCellData("VALUE", 17));
	    HelperFunctions.waitForPageToLoad(3);
    	//sites.click();
    	//productcentral.click();
    	//us.click();
    	//en.click();
    	createButton.click();
    	pageButton.click();
    	HelperFunctions.waitForPageToLoad(5);
    	productListingPageTemplate.click();
    	nextButton.click();
    	HelperFunctions.waitForPageToLoad(5);
    	productCentralTab.click();
    	
    	for(WebElement each: documentCategoryTag) {
    		if(each.getText().contains("Hosted Software Terms")) {
    			each.click();
    			break;
    		}
    	}
    	
    	
    	
    	
    }
    
    public void setHyperlinks() throws Exception {
    	
    	
    	read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("DATA", 1));
		next.click();
		pass.sendKeys(read1.getCellData("VALUE", 1));
		submit.click();
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs.get(1));
	    Driver.getDriver().get(read1.getCellData("VALUE", 17));
	    HelperFunctions.waitForPageToLoad(3);
	    productsPackage.click();
	    HelperFunctions.staticWait(3);
	    cloudPackage.click();
	    HelperFunctions.staticWait(3);
	    String expectedTitle="Offering Overview";
    	String expectedTitle2="Terms & Conditions";
    	String expectedTitle3="Maintenance & Support";
    	String expectedTitle4="Documentation";
    	Assert.assertTrue(firstPositionAuthor.getText().contains(expectedTitle));
    	Assert.assertTrue(secondPositionAuthor.getText().contains(expectedTitle2));
    	Assert.assertTrue(thirdPositionAuthor.getText().contains(expectedTitle3));
    	Assert.assertTrue(forthPositionAuthor.getText().contains(expectedTitle4));
    	
    	
    	JavascriptExecutor js2 = ((JavascriptExecutor) Driver.getDriver());
        js2.executeScript("window.open()");
	    ArrayList<String> tabs2 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs2.get(1));
	    Driver.getDriver().get(read1.getCellData("VALUE", 21));
	    HelperFunctions.waitForPageToLoad(3);
	    Assert.assertTrue(firstTitle.getText().contains(expectedTitle));
	    Assert.assertTrue(secondTitle.getText().contains(expectedTitle2));
	    Assert.assertTrue(thirdTitle.getText().contains(expectedTitle3));
	    Assert.assertTrue(forthTitle.getText().contains(expectedTitle4));
    	
    	
    	
    	
    }
    
    
    public void setSitemap() throws Exception {
    	
    	read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("DATA", 1));
		next.click();
		pass.sendKeys(read1.getCellData("VALUE", 1));
		submit.click();
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs.get(1));
	    Driver.getDriver().get(read1.getCellData("VALUE", 16));
	    HelperFunctions.waitForPageToLoad(5);
	    sitemap.click();
	    settingIcon.click();
	    ArrayList<String> tabs7 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs7.get(1));
	    checkforOptions.click();
	    myproductImage.click();
	    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", myproductImage);
        JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
        executor2.executeScript("arguments[0].click();", myproductImage);
        HelperFunctions.staticWait(3);
        JavascriptExecutor executor3 = (JavascriptExecutor) Driver.getDriver();
        executor3.executeScript("arguments[0].click();", selectButton);
	   
	    HelperFunctions.staticWait(3);
	    checkIcon.click();
	    previewButton2.click();
	    for(WebElement each: sitemapContents) {
	    	if(each.getText().contains("Fluid Forecast")&& each.getText().contains("Disclosure Checklist")
	    			&&!each.getText().contains("Products") ) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    HelperFunctions.staticWait(3);
	    editnextToPreview.click();
	    HelperFunctions.staticWait(3);
	    sitemap.click();
	    settingIcon.click();
	    ArrayList<String> tabs8 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs8.get(1));
	    checkforOptions.click();
	    automationImage.click();
	    JavascriptExecutor executor4 = (JavascriptExecutor) Driver.getDriver();
        executor4.executeScript("arguments[0].click();", automationImage);
        JavascriptExecutor executor5 = (JavascriptExecutor) Driver.getDriver();
        executor5.executeScript("arguments[0].click();", automationImage);
        HelperFunctions.staticWait(3);
        JavascriptExecutor executor6 = (JavascriptExecutor) Driver.getDriver();
        executor6.executeScript("arguments[0].click();", selectButton);
	   
	    HelperFunctions.staticWait(3);
	    checkIcon.click();
	    previewButton2.click();
	    for(WebElement each: sitemapContents) {
	    	if(each.getText().contains("Products")&& each.getText().contains("Reseller Demo")) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    
	    
    	
    	
    	
    }
    
 public void setHideSitemap() throws Exception {
    	
    	read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("DATA", 1));
		next.click();
		pass.sendKeys(read1.getCellData("VALUE", 1));
		submit.click();
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs.get(1));
	    Driver.getDriver().get(read1.getCellData("VALUE", 17));
	    HelperFunctions.waitForPageToLoad(5);
	    homepageDemo.click();
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", homepageDemo);
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
        executor2.executeScript("arguments[0].click();", homepageDemo);
	    HelperFunctions.staticWait(5);
	    properties.click();
	    HelperFunctions.waitForPageToLoad(5);
	    hidesitemapCheckbox.click();
	    saveAndClose.click();
	    HelperFunctions.waitForPageToLoad(5);
	    JavascriptExecutor executor3 = (JavascriptExecutor) Driver.getDriver();
        executor3.executeScript("arguments[0].click();", homepageDemo);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor executor4 = (JavascriptExecutor) Driver.getDriver();
        executor4.executeScript("arguments[0].click();", homepageDemo);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor executor5 = (JavascriptExecutor) Driver.getDriver();
        executor5.executeScript("arguments[0].click();", homepageDemo);
	    quickPublish.click();
	    ArrayList<String> tabs2 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs2.get(1));
	    JavascriptExecutor executor6 = (JavascriptExecutor) Driver.getDriver();
        executor6.executeScript("arguments[0].click();",  Publish);
	   
	   
	    JavascriptExecutor js2 = ((JavascriptExecutor) Driver.getDriver());
        js2.executeScript("window.open()");
	    ArrayList<String> tabs3 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs3.get(1));
	    Driver.getDriver().get(read1.getCellData("VALUE", 18));
	    String expectedContent="Homepage Demo";
	    for(WebElement eachContent: sitemapContents) {
	    	System.out.println(eachContent.getText());
	    	if(!eachContent.getText().contains(expectedContent)) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
    	
    	
    }
 
 public void setTilesAuthorization() throws Exception {
	 read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("DATA", 1));
		next.click();
		pass.sendKeys(read1.getCellData("VALUE", 1));
		submit.click();
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
     js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs.get(1));
	    Driver.getDriver().get(read1.getCellData("VALUE", 19));
	    HelperFunctions.waitForPageToLoad(5);
	   
		for(WebElement eachTile: legalTiles) {
			if(eachTile.getText().contains("Offering Overview")&& eachTile.getText().contains("Maintenance & Support")&& eachTile.getText().contains("Data Processing Addendum")
    				) {
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
	    JavascriptExecutor executor5 = (JavascriptExecutor) Driver.getDriver();
        executor5.executeScript("arguments[0].click();", legalTilesAuth);
        settingIcon.click();
        ArrayList<String> tabs5 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs5.get(1));
	    legalTilesAuthFirstCheckbox.click();
	    ArrayList<String> tabs6 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs6.get(1));
	    dataProcessingImg.click();
	    HelperFunctions.staticWait(3);
	    selectButton.click();
	    HelperFunctions.staticWait(3);
	    checkIcon.click();
	    for(WebElement eachTile: legalTiles) {
			if(eachTile.getText().contains("Offering Overview")&& eachTile.getText().contains("Data Processing Addendum")&& eachTile.getText().contains("Data Processing Addendum")
    				) {
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor executor6 = (JavascriptExecutor) Driver.getDriver();
        executor6.executeScript("arguments[0].click();", legalTilesAuth);
        settingIcon.click();
        ArrayList<String> tabs7 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs7.get(1));
	    legalTilesAuthFirstCheckbox.click();
	    ArrayList<String> tabs8 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs8.get(1));
	    maintenanceImg.click();
	    HelperFunctions.staticWait(3);
	    selectButton.click();
	    HelperFunctions.staticWait(3);
	    checkIcon.click();
	    for(WebElement eachTile: legalTiles) {
			if(eachTile.getText().contains("Offering Overview")&& eachTile.getText().contains("Maintenance & Support")&& eachTile.getText().contains("Data Processing Addendum")
    				) {
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
	    
	    
	    
	    
 }
 
 public void setContentAuthorization() throws Exception {
	 read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("DATA", 1));
		next.click();
		pass.sendKeys(read1.getCellData("VALUE", 1));
		submit.click();
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
  js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs.get(1));
	    Driver.getDriver().get(read1.getCellData("VALUE", 20));
	    HelperFunctions.waitForPageToLoad(5);
	    offeringOverviewLink2auth.click();
	    settingIcon.click();
	    ArrayList<String> tabs7 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs7.get(1));
	    titleField.click();
	    titleField.clear();
	    titleField.sendKeys("test");
	    HelperFunctions.staticWait(3);
	    checkIcon.click();
	    HelperFunctions.staticWait(3);
	    previewButton2.click();
	    Set<String> allWindows4=Driver.getDriver().getWindowHandles();
        List<String> windowsList4=new ArrayList<>(allWindows4);
        Driver.getDriver().switchTo().window(windowsList4.get(1));
        
        Driver.getDriver().switchTo().frame(0);
	 String expectedTitle="test";
	 String actualTitle=contentTitle.getText();
	 Assert.assertEquals(expectedTitle, actualTitle);
	 Driver.getDriver().switchTo().defaultContent();
	 editButtonContent.click();
	 offeringOverviewLink2auth.click();
	 settingIcon.click();
	    ArrayList<String> tabs8 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs7.get(1));
	    titleField.click();
	    titleField.clear();
	    titleField.sendKeys("Offering Overview");
	    HelperFunctions.staticWait(3);
	    checkIcon.click();
	    HelperFunctions.staticWait(3);
	    previewButton2.click();
	    Set<String> allWindows5=Driver.getDriver().getWindowHandles();
     List<String> windowsList5=new ArrayList<>(allWindows5);
     Driver.getDriver().switchTo().window(windowsList5.get(1));
     
     Driver.getDriver().switchTo().frame(0);
	 String expectedTitle2="Offering Overview";
	 String actualTitle2=contentTitle.getText();
	 Assert.assertEquals(expectedTitle2, actualTitle2);
	 
	 
 }
 
 public void setUpdatedDate() throws Exception {
	 read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("DATA", 1));
		next.click();
		pass.sendKeys(read1.getCellData("VALUE", 1));
		submit.click();
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs.get(1));
	    Driver.getDriver().get(read1.getCellData("VALUE", 20));
	    HelperFunctions.waitForPageToLoad(5);
	    offeringOverviewPdfauth.click();
	    settingIcon.click();
	    ArrayList<String> tabs7 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs7.get(1));
	    pdfOptions.click();
	    ArrayList<String> tabs8 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs8.get(1));
	    pdfImage.click();
	    selectButton.click();
	    
	    
	    
	    
 }
 
 public void setHomepageTileAuthorization() throws Exception {
	 read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("DATA", 1));
		next.click();
		pass.sendKeys(read1.getCellData("VALUE", 1));
		submit.click();
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs.get(1));
	    Driver.getDriver().get(read1.getCellData("VALUE", 10));
	    HelperFunctions.waitForPageToLoad(5);
	    homepageTileauth.click();
	    settingIcon.click();
	    ArrayList<String> tabs7 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs7.get(1));
	    collapseHeader.click();
	    titleofTile.click();
	    titleofTile.clear();
	    titleofTile.sendKeys("Tile 1");
	    HelperFunctions.staticWait(3);
	    checkIcon.click();
	    HelperFunctions.staticWait(3);
	    previewButton2.click();
	    Set<String> allWindows4=Driver.getDriver().getWindowHandles();
        List<String> windowsList4=new ArrayList<>(allWindows4);
        Driver.getDriver().switchTo().window(windowsList4.get(1));
        
        Driver.getDriver().switchTo().frame(0);
	 String expectedTitle="Tile 1";
	 String actualTitle=firstTitleofTile.getText();
	 Assert.assertEquals(expectedTitle, actualTitle);
	 Driver.getDriver().switchTo().defaultContent();
	 editButtonContent.click();
	 homepageTileauth.click();
	    settingIcon.click();
	    ArrayList<String> tabs9 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs9.get(1));
	    collapseHeader.click();
	    titleofTile.click();
	    titleofTile.clear();
	    titleofTile.sendKeys("Legal");	
	    HelperFunctions.staticWait(3);
	    checkIcon.click();
	    HelperFunctions.staticWait(3);
	    previewButton2.click();
	    Set<String> allWindows5=Driver.getDriver().getWindowHandles();
     List<String> windowsList5=new ArrayList<>(allWindows5);
     Driver.getDriver().switchTo().window(windowsList5.get(1));
     
     Driver.getDriver().switchTo().frame(0);
	 String expectedTitle2="Legal";
	 String actualTitle2=firstTitleofTile.getText();
	 Assert.assertEquals(expectedTitle2, actualTitle2);
	    
	    
	    
	    
 }
 
 public void setDisplayingLogintomyProductLink() throws Exception {
	 read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("DATA", 1));
		next.click();
		pass.sendKeys(read1.getCellData("VALUE", 1));
		submit.click();
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs.get(1));
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(5);
	    
	    for(WebElement eachLink: loginToMyProductsLinks) {
	    	if(eachLink.getText().contains("Login to My Products")) {
	    		Assert.assertTrue(false);
	    	}else {
	    		Assert.assertTrue(true);
	    	}
	    }
	 
	 
	 
 }
 public void setUnpublishWorkflow() throws Exception {
 	
 	read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("DATA", 1));
		next.click();
		pass.sendKeys(read1.getCellData("VALUE", 1));
		submit.click();
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
     js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs.get(1));
	    Driver.getDriver().get(read1.getCellData("VALUE", 17));
	    HelperFunctions.waitForPageToLoad(5);
	    resellerdemoImage.click();
	    JavascriptExecutor executor4 = (JavascriptExecutor) Driver.getDriver();
        executor4.executeScript("arguments[0].click();", resellerdemoImage);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor executor5 = (JavascriptExecutor) Driver.getDriver();
        executor5.executeScript("arguments[0].click();", resellerdemoImage);
	    managePublication.click();
	    HelperFunctions.waitForPageToLoad(5);
	    unpublish.click();
	    HelperFunctions.waitForPageToLoad(5);
	    nextButton.click();
	    HelperFunctions.waitForPageToLoad(5);
	    JavascriptExecutor executor6 = (JavascriptExecutor) Driver.getDriver();
        executor6.executeScript("arguments[0].click();", resellerdemoImageforUnpublish);
	    unpublishButton.click();
	    HelperFunctions.staticWait(3);
	    continueButton.click();
	    JavascriptExecutor js2 = ((JavascriptExecutor) Driver.getDriver());
	     js2.executeScript("window.open()");
		    ArrayList<String> tabs2 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
		    Driver.getDriver().switchTo().window(tabs2.get(1));
		    Driver.getDriver().get(read1.getCellData("VALUE", 17));
		    HelperFunctions.waitForPageToLoad(5);
	    JavascriptExecutor executor7 = (JavascriptExecutor) Driver.getDriver();
        executor7.executeScript("arguments[0].click();", resellerdemoImage);
        HelperFunctions.staticWait(3);
        for(WebElement eachInfo: publishInformation) {
        	System.out.println(eachInfo.getText());
        	if(eachInfo.getText().contains("Not published")) {
        		Assert.assertTrue(true);
        	}else {
        		Assert.assertTrue(false);
        	}
        }
        JavascriptExecutor executor8 = (JavascriptExecutor) Driver.getDriver();
        executor8.executeScript("arguments[0].click();", resellerdemoImage);
        resellerDemo.click();
        HelperFunctions.staticWait(3);
        JavascriptExecutor executor9 = (JavascriptExecutor) Driver.getDriver();
        executor9.executeScript("arguments[0].click();", checkinImg);
        HelperFunctions.staticWait(3);
        for(WebElement eachInfo: publishInformation) {
        	System.out.println(eachInfo.getText());
        	if(eachInfo.getText().contains("Not published")) {
        		Assert.assertTrue(true);
        	}else {
        		Assert.assertTrue(false);
        	}
        }
        
        HelperFunctions.staticWait(3);
        quickPublish2.click();
        publish2.click();
        JavascriptExecutor executor10 = (JavascriptExecutor) Driver.getDriver();
        executor10.executeScript("arguments[0].click();", checkinImg);
        HelperFunctions.staticWait(3);
        JavascriptExecutor executor11 = (JavascriptExecutor) Driver.getDriver();
        executor11.executeScript("arguments[0].click();", microsoftImg);
        JavascriptExecutor executor12 = (JavascriptExecutor) Driver.getDriver();
        executor12.executeScript("arguments[0].click();", microsoftImg);
        JavascriptExecutor executor13 = (JavascriptExecutor) Driver.getDriver();
        executor13.executeScript("arguments[0].click();", microsoftImg);
        HelperFunctions.staticWait(3);
        quickPublish2.click();
        HelperFunctions.staticWait(3);
        publish2.click();
        JavascriptExecutor executor14 = (JavascriptExecutor) Driver.getDriver();
        executor14.executeScript("arguments[0].click();", microsoftImg);
        HelperFunctions.staticWait(3);
        JavascriptExecutor executor15 = (JavascriptExecutor) Driver.getDriver();
        executor15.executeScript("arguments[0].click();", dragosImg);
        JavascriptExecutor executor16 = (JavascriptExecutor) Driver.getDriver();
        executor16.executeScript("arguments[0].click();", dragosImg);
        JavascriptExecutor executor17 = (JavascriptExecutor) Driver.getDriver();
        executor17.executeScript("arguments[0].click();", dragosImg);
        HelperFunctions.staticWait(3);
        quickPublish2.click();
        HelperFunctions.staticWait(3);
        publish2.click();
        JavascriptExecutor executor18 = (JavascriptExecutor) Driver.getDriver();
        executor18.executeScript("arguments[0].click();", dragosImg);
        HelperFunctions.staticWait(3);
        JavascriptExecutor executor19 = (JavascriptExecutor) Driver.getDriver();
        executor19.executeScript("arguments[0].click();", resellerdemoImage);
        JavascriptExecutor executor20 = (JavascriptExecutor) Driver.getDriver();
        executor20.executeScript("arguments[0].click();", resellerdemoImage);
        JavascriptExecutor executor21 = (JavascriptExecutor) Driver.getDriver();
        executor21.executeScript("arguments[0].click();", resellerdemoImage);
        HelperFunctions.staticWait(3);
        quickPublish2.click();
        HelperFunctions.staticWait(3);
        publish2.click();
        HelperFunctions.staticWait(3);
        for(WebElement eachInfo: publishInformation) {
        	System.out.println(eachInfo.getText());
        	if(!eachInfo.getText().contains("Not published")) {
        		Assert.assertTrue(true);
        	}else {
        		Assert.assertTrue(false);
        	}
        }
        
	    
	    
 }
    
    
    
    
    
    

}
