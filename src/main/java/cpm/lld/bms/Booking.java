package cpm.lld.bms;

import java.util.Date;
import java.util.List;

public class Booking {

  String bookingId;
  Date bookingDate;
  Member member;
  Audi audi;
  Show show;
  BookingStatus bookingStatus;
  double totalAmount;
  List<Seat> seats;
  Payment paymentObj;

  public boolean makePayment(Payment payment) {
    return false;
  }

}
