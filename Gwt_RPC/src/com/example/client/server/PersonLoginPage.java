package com.example.client.server;
import com.example.client.gui.MaiGUI;
import com.example.client.gui.Person;
import com.example.client.gui.ShowChart;
import com.example.client.gui.SurveyApp;
import com.example.client.gui.SurveyApplication;
import com.example.client.server.ExampleServiceClientImpl;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PersonLoginPage extends Composite{
	private VerticalPanel vPnel=new VerticalPanel();
	private ExampleServiceClientImpl serviceImpl;
	private Label resultl;
	private Label name;
	private Label surname;
	private Label pass;
	private MaiGUI maingui;
	private Person personInfo;
	private TextBox txtPassword;
	
	private TextBox nametxt;
	private TextBox surnametxt;
	private TextBox passwordtxt;
	private Button submmitBtn;
	
	
	private String name1;
	private String surname1;
	private String password1;

	
	public PersonLoginPage(ExampleServiceClientImpl serviceImpl){
		initWidget(this.vPnel);
		this.serviceImpl=serviceImpl;
		
		Label titelLbl=new Label("Login Page");
		this.vPnel.add(titelLbl);
		this.vPnel.setCellHorizontalAlignment(titelLbl, HasHorizontalAlignment.ALIGN_CENTER);
		
		FlexTable table=new FlexTable();
		this.vPnel.add(table);
		this.vPnel.setCellHorizontalAlignment(table, HasHorizontalAlignment.ALIGN_CENTER);
		
		Label nameLbl=new Label("Name");
		table.setWidget(0, 0, nameLbl);
		
		Label surnameLbl=new Label("Surname");
		table.setWidget(1, 0, surnameLbl);
		
		Label passwordLbl=new Label("Password");
		table.setWidget(2, 0, passwordLbl);
		
		
	    nametxt=new TextBox();
		table.setWidget(0, 1, nametxt);
		
		surnametxt=new TextBox();
		table.setWidget(1, 1, surnametxt);
		
		passwordtxt=new TextBox();
		table.setWidget(2, 1, passwordtxt);
		
//		
//		this.txt=new TextBox();
//		
//		this.txt2=new TextBox();
//		this.txtPassword=new TextBox();
//		
		
	   
		
//		this.vPnel.add(txt);
//		this.vPnel.add(txt2);
//		this.vPnel.add(txtPassword);
		
	    submmitBtn=new Button("Submmit");
	    this.vPnel.add(submmitBtn);
	    this.vPnel.setCellHorizontalAlignment(submmitBtn, HasHorizontalAlignment.ALIGN_CENTER);

		submmitBtn.addClickHandler(new Btn1ClickHandler());
		
			
		
		
		
//		this.resultl=new Label("");
//	    this.vPnel.add(resultl);
//	    
//	    this.name=new Label("");
//	    this.vPnel.add(name);
//	    
//	    this.surname=new Label("");
//	    this.vPnel.add(surname);
//	     
//	    this.pass=new Label("");
//	    this.vPnel.add(pass);
//	    
	    this.maingui=new MaiGUI(serviceImpl);
	}
	public void updateLabel(String greeting ){
	this.resultl.setText(greeting);
		
}
	public void updatePersonPage(Person person ){
//           this.personInfo=person;
//           this.vPnel.clear();
//           SurveyApplication pageSurvey=new SurveyApplication();
//           this.vPnel.add(pageSurvey);
//           this.vPnel.setCellHorizontalAlignment(pageSurvey, HasHorizontalAlignment.ALIGN_CENTER);
//           
//		String pass=String.valueOf(person.getPassword());
//		this.resultl.setText(person.getName());
//		this.surname.setText(person.getSurname());
//		this.pass.setText(pass);
	}
	public void updatadeSurveyApplicaiton(Person person){
        this.vPnel.clear();
       // SurveyApplication survey=new SurveyApplication(serviceImpl);
        SurveyApp survey = new SurveyApp();
        this.vPnel.add(survey);
        this.vPnel.setCellHorizontalAlignment(survey, HasHorizontalAlignment.ALIGN_CENTER);
	}
	
	public void updateChart(Person person){
        
        this.vPnel.clear();
        //ShowChart chart=new ShowChart();
//        this.vPnel.add(chart);
//        this.vPnel.setCellHorizontalAlignment(chart, HasHorizontalAlignment.ALIGN_CENTER);
//		
	}
	
	public void handleEvent(Object result){
		
		if(result instanceof String){
			String greeting=(String)result;
			//maingui.updateLabel(greeting);
		
		}
		else if(result instanceof Person){
			Person person= (Person) result;
			updatePersonPage(person);
			this.updatadeSurveyApplicaiton(person);			
		}
		System.out.println("response recieved");
		
	}
	
private class Btn1ClickHandler implements ClickHandler{

	@Override
	public void onClick(ClickEvent event) {
		 name1=nametxt.getText();
	     surname1=surnametxt.getText();
         password1=passwordtxt.getText();
		Integer pass1 = Integer.valueOf(password1);
		serviceImpl.getPerson(name1,surname1,pass1);
	}
	
}

public MaiGUI getMainGUI(){
	return this.maingui;
}
}

