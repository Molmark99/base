package hu.bme.mit.train.interfaces;

public interface TrainController {

	void followSpeed();

	

	int unfollowSpeed();

	int getReferenceSpeed();

	void setSpeedLimit(int speedLimit);

	void setJoystickPosition(int joystickPosition);

}
