package test;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.RobotLog;

import team25core.MineralDetectionTask;
import team25core.Robot;
import team25core.RobotEvent;

@Autonomous(name = "Stones Detection Test", group = "Team 25")
public class Stonedetectiontest extends Robot {

    private final static String TAG = "StoneDetectionTest";

    StoneDetectionTaskMargarita mdTask;

    @Override
    public void handleEvent(RobotEvent e)
    {
    }

    @Override
        public void init()
        {
            mdTask = new StoneDetectionTaskMargarita(this) {
                @Override
                public void handleEvent(RobotEvent e) {
                    StoneDetectionEvent event = (StoneDetectionEvent)e;
                    RobotLog.ii(TAG, "Saw: " + event.kind + " Confidence: " + event.stones.get(0).getConfidence());
                }
            };

            mdTask.init(telemetry, hardwareMap);
            mdTask.setDetectionKind(StoneDetectionTaskMargarita.DetectionKind.EVERYTHING);

        }
    @Override
    public void start()
    {
        addTask(mdTask);
    }
}
