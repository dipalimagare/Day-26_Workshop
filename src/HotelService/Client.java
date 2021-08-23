package HotelService;
import java.util.*;


public class Client {
	public enum ClientType {
		Regular,
		Rewards
	}
	
	public  class Factory {

		public static Client CreateFromString(String ClientString) {
			ClientType Type;
			ClientString = ClientString.toLowerCase().trim();
			switch (ClientString) {
				case "regular":
					Type = ClientType.Regular;
					break;
				case "rewards":
					Type = ClientType.Rewards;
					break;
				
			}
			return new Client();
		}

	}

}


