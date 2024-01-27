package in.madhav.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import in.madhav.binding.Orders;
import in.madhav.constants.AppConstants;

@Service
public class OrderService {

	@Autowired
	private KafkaTemplate<String, Orders> kafkaTemplate;
	
	
	public String addMsg(Orders order) {
		
		//publishing msg to kafka
		
		kafkaTemplate.send(AppConstants.TOPIC_NAME,order);
		
		return "Published to kafka topic";
		
	}
}
