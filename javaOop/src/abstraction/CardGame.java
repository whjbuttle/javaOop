package abstraction;

public class CardGame extends CardGameRule {

	@Override
	public void play(Card card1, Card card2) {
		/*
		 �Ķ���ͷ� ���� �� ���� ī�带 ���ؼ� ī���� ���ڰ� ū ī�尡 �¸��ϴ� ��� �˰����� ����ÿ�
		 */
		
		if( card1.getNum() > card2.getNum()){
			super.setResult("CARD 1 �¸�");
		} else if ( card1.getNum() < card2.getNum() ){
			super.setResult("CARD 2 �¸�");
		} else {
			super.setResult("���º�");
		}
	}
	
}
