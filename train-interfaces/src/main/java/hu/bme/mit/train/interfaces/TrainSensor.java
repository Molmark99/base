package hu.bme.mit.train.interfaces;

public interface TrainSensor {

	int getSpeedLimit();
	int getNegativSpeedLimit();

	void overrideSpeedLimit(int speedLimit);

}
