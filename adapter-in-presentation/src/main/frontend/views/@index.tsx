import {VerticalLayout} from "@vaadin/react-components";
import {Feature1Endpoint} from "Frontend/generated/endpoints";
import {useEffect} from "react";
import {useSignal} from "@vaadin/hilla-react-signals";

export default function TestView() {

    const counter = useSignal(0);

    async function getCounter() {
        counter.value = await Feature1Endpoint.getCounter();
    }

    useEffect(() => {
        getCounter().catch(console.error)
    }, [])

    return <VerticalLayout theme="padding spacing">
        <h1>VAADIN MULTI-MODULE DEMO</h1>
        <h2>{counter}</h2>
    </VerticalLayout>
}