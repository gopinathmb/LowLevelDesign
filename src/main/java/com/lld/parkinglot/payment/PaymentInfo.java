/**
 * Created by gopinath_mb on Jan 20, 2022
 */
package com.lld.parkinglot.payment;

import java.util.Date;

import com.lld.parkinglot.ticket.ParkingTicket;

public class PaymentInfo {

	double amount;
	Date paymentDate;
	int transactionId;
	ParkingTicket parkingTicket;
	PaymentStatus paymentStatus;

}

