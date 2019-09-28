package team25core;

import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.util.RobotLog;


public class TouchSensorCriteria implements SensorCriteria {

        TouchSensor touchGo;
        TouchSensor touchStop;
        Boolean can_move;

        public TouchSensorCriteria(TouchSensor touchGo, TouchSensor touchStop)
        {
            //TODO: Determine criteria for motion
            this.touchGo = touchGo;
        }


    @Override
    public boolean satisfied()
    {
        if ( can_move)  {
            return true;
        } else {
            return false;
        }

    }

}