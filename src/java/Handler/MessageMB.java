/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Message;

/**
 *
 * @author Rakib
 */
@ManagedBean
@SessionScoped
public class MessageMB {

    Message message = new Message();

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getMsg() {
        message.setMessage(message.getMessage());
        return message.getMessage();
    }

}
