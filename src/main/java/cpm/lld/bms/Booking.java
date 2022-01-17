package cpm.lld.bms;
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

	public boolean makePayment(Payment payment);

}

