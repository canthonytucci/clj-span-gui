(ns clj-span-gui.core
  (:import (javax.swing JFrame JLabel JTextField JButton)
	   (java.awt.event ActionListener)
	   (java.awt GridLayout)))

(defn init []
  (let [frame (new JFrame "clj-span-gui")
	source-layer-text (new JTextField)
	sink-layer-text (new JTextField)
	use-layer-text (new JTextField)
	flow-layer-text (new JTextField)
	source-layer-label (new JLabel "Source Layer")
	sink-layer-label (new JLabel "Sink Layer")
	use-layer-label (new JLabel "Use Layer")
	flow-layer-label (new JLabel "Flow Layer")
	
	source-thresh-text (new JTextField)
	sink-thresh-text (new JTextField)
	use-thresh-text (new JTextField)
	trans-thresh-text (new JTextField)
	source-thresh-label (new JLabel "Source Threshold")
	sink-thresh-label (new JLabel "Sink Threshold")
	use-thresh-label (new JLabel "Use Threshold")
	trans-thresh-label (new JLabel "Trans Threshold")
	
	rv-max-states-text (new JTextField)
	downscaling-factor-text (new JTextField)
	rv-max-states-label (new JLabel "RV Max States")
	downscaling-factor-label (new JLabel "Downscaling Factor")

	
	sink-type-label (new JLabel "Sink Type")
	sink-type-buttongroup (new ButtonGroup)
	sink-absolute-button (new JRadioButton "Absolute" false)
	sink-relative-button (new JRadioButton "Relative" false)



	use-type-label (new JLabel "Use Type")
	use-type-buttongroup (new ButtonGroup)
	use-absolute-button (new JRadioButton "Absolute" false)
	use-relative-button (new JRadioButton "Relative" false)



	benefit-type-label (new JLabel "Benefit Type")
	benefit-type-buttongroup (new ButtonGroup)
	benefit-rival-button (new JRadioButton "Rival" false)
	benefit-non-button (new JRadioButton "Non-Rival" false)



	flow-model-label (new JLabel "Flow Model")
	flow-model-buttongroup (new ButtonGroup)
	flow-lineofsight-button (new JRadioButton "Line of Sight" false)
	flow-proximity-button (new JRadioButton "Proximity" false)
	flow-carbon-button (new JRadioButton "Carbon" false)
	flow-sediment-button (new JRadioButton "Sediment" false)


	
	engage-button (new JButton "Engage")])

  (doto sink-type-buttongroup
	  (.add sink-absolute-button)
	  (.add sink-relative-button))

    (doto use-type-buttongroup
	  (.add use-absolute-button)
	  (.add use-relative-button))
	
    (doto benefit-type-buttongroup
	  (.add benefit-rival-button)
	  (.add benefit-non-button))

    (doto flow-model-buttongroup
	  (.add flow-lineofsign-button)
	  (.add flow-proximity-button)
	  (.add flow-carbon-button)
	  (.add flow-sediment-button))
	

    (doto frame
      ;;(.setDefaultCloseOperation (JFrame/EXIT_ON_CLOSE))
      (.setLayout (new GridLayout 2 2 3 3))
    (.add source-layer-label)
    (.add source-layer-text)
    (.add sink-layer-label)
    (.add sink-layer-text)
    (.add use-layer-label)
    (.add use-layer-text)
    (.add flow-layer-label)
    (.add flow-layer-text)
    (.add source-thresh-label)
    (.add source-thresh-text)

    (.add sink-thresh-label)
    (.add sink-thresh-text)
    (.add use-thresh-label)
    (.add use-thresh-text)
    (.add trans-thresh-label)
    (.add trans-thresh-text)

    (.add rv-max-states-label)
    (.add rv-max-states-text)
    (.add downscaling-factor-label)
    (.add downscaling-factor-text)

    (.add sink-type-label)
    (.add sink-absolute-button)
    (.add sink-relative-button)
    
    (.add use-type-label)
    (.add use-absolute-button)
    (.add use-relative-button)

    (.add benefit-type-label)
    (.add benefit-type-rival-button)
    (.add benefit-type-non-button)

    (.add flow-model-label)
    (.add flow-lineofsight-button)
    (.add flow-proximity-button)
    (.add flow-carbon-button)
    (.add flow-sediment-button)

    (.add engage-button)

      (.setVisible true)))

(init)
