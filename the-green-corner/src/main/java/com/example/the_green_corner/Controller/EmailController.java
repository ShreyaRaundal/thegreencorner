package com.example.the_green_corner.Controller;




	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.the_green_corner.service.EmailServise;

	@RestController
	public class  EmailController  {

	    @Autowired
	    private EmailServise emailService;

	    @GetMapping("/send-email")
	    public String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) {
	        emailService.sendEmail(to, subject, text);
	        return "Email sent successfully!";
	    }
	}


