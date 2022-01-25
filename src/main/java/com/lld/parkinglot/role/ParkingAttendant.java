package com.lld.parkinglot.role;

import com.lld.parkinglot.payment.Payment;
import com.lld.parkinglot.payment.PaymentInfo;
import com.lld.parkinglot.payment.PaymentType;
import com.lld.parkinglot.ticket.ParkingTicket;
import com.lld.parkinglot.vehicle.Vehicle;

import cpm.lld.bms.Account;

public class ParkingAttendant extends Account {

  Payment paymentService;

  public boolean processVehicleEntry(Vehicle vehicle)
  {
    return false;
  }

  public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType)
  {
    return null;
  }

}